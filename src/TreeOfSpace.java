import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TreeOfSpace {

    static class node {
        String name;
        int id;
        int desclockCount;
        List<node> child;
        node prev;

        node(String name) {
            this.name = name;
            this.id = 0;
            this.desclockCount = 0;
            this.prev = null;
            this.child = null; // Initialized to null
        }
    }

    static class treeLock {
        node[] nodes;
        Map<String, Integer> map;

        treeLock(int n, int m, String[] countries) {
            nodes = new node[n];
            map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                nodes[i] = new node(countries[i]);
                map.put(countries[i], i);
            }

            for (int i = 1; i < n; i++) {
                int parentInd = (i - 1) / m;
                if (nodes[parentInd].child == null) {
                    nodes[parentInd].child = new ArrayList<>();
                }
                nodes[parentInd].child.add(nodes[i]);
                nodes[i].prev = nodes[parentInd];
            }
        }

        void incrLockCount(node currNode) {
            for (; currNode != null; currNode = currNode.prev) {
                currNode.desclockCount++;
            }
        }

        void decrLockCount(node currNode) {
            for (; currNode != null; currNode = currNode.prev) {
                currNode.desclockCount--;
            }
        }

        boolean checkRelatedDesc(node currNode, int uid, List<node> locked) {
            if (currNode == null) return true;
            if (currNode.child != null) {
                for (node children : currNode.child) {
                    if (children.id != 0) {
                        if (children.id != uid) return false;
                        locked.add(children);
                    }
                    if (!checkRelatedDesc(children, uid, locked)) return false;
                }
            }
            return true;
        }

        boolean lock(String name, int uid) {
            int nodeInd = map.get(name);

            if (nodes[nodeInd].id != 0 || nodes[nodeInd].desclockCount != 0) {
                return false;
            }

            node parent = nodes[nodeInd].prev;
            while (parent != null) {
                if (parent.id != 0) return false;
                parent = parent.prev;
            }

            nodes[nodeInd].id = uid;
            if (nodes[nodeInd].prev != null)
                incrLockCount(nodes[nodeInd].prev);

            return true;
        }

        boolean unlock(String name, int uid) {
            int nodeInd = map.get(name);
            if (nodes[nodeInd].id == uid) {
                nodes[nodeInd].id = 0;
                if (nodes[nodeInd].prev != null)
                    decrLockCount(nodes[nodeInd].prev);
                return true;
            }
            return false;
        }

        boolean upgrade(String name, int uid) {
            int nodeInd = map.get(name);

            if (nodes[nodeInd].id != 0)
                return false;

            node tempParent = nodes[nodeInd].prev;
            while (tempParent != null) {
                if (tempParent.id != 0)
                    return false;
                tempParent = tempParent.prev;
            }

            if (nodes[nodeInd].desclockCount == 0)
                return false;

            List<node> locked = new ArrayList<>();
            if (!checkRelatedDesc(nodes[nodeInd], uid, locked))
                return false;

            for (node nd : locked) {
                unlock(nd.name, uid);
            }

            lock(nodes[nodeInd].name, uid);
            return true;
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine(); // Consume the rest of the line

        String[] countries = new String[n];
        for (int i = 0; i < n; i++) {
            countries[i] = sc.nextLine();
        }

        treeLock tree = new treeLock(n, m, countries);

        for (int i = 0; i < q; i++) {
            String line = sc.nextLine().trim();
            String[] arr = line.split(" ");
            int type = Integer.parseInt(arr[0]);
            String nodename = arr[1];
            int user = Integer.parseInt(arr[2]);

            boolean res = false;

            if (type == 1) {
                res = tree.lock(nodename, user);
            } else if (type == 2) {
                res = tree.unlock(nodename, user);
            } else if (type == 3) {
                res = tree.upgrade(nodename, user);
            }

            System.out.println(res ? "true" : "false");
        }
    }
}

/*
//ip1

7 2 20
A
B
C
D
E
F
G
1 D 1
1 E 2
1 B 3
1 F 1
2 D 2
2 D 1
1 D 2
3 B 1
3 B 2
3 A 2
1 A 2
2 A 2
1 G 3
1 F 3
3 C 3
3 A 3
2 G 3
3 C 3
1 A 3
3 A 3

// op1

true
true
false
true
false
true
true
false
true
false
false
false
true
false
false
false
true
false
false
false

//ip2
7 2 20
A
B
C
D
E
F
G
1 D 1
1 E 2
1 B 3
1 F 1
2 D 2
2 D 1
1 D 2
3 B 1
3 B 2
3 A 2
1 A 2
2 A 2
1 G 3
1 F 3
3 C 3
3 A 3
2 G 3
3 C 3
1 A 3
3 A 3

//op2
true
true
false
true
false
true
true
false
true
false
false
false
true
false
false
false
true
false
false
false

 */

