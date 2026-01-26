import java.util.ArrayList;

public class vertical_eff_print {

    static int calculate_min_level(bst.node p,int val){
        if (p==null){
            return val;
        }
        if(p.left != null){
            val = Math.min(calculate_min_level(p.left,val-1),val);
        }
        if(p.right != null){
            val = Math.min(calculate_min_level(p.right,val+1),val);
        }
        return val;
    }

    static int calculate_max_level(bst.node p,int val){
        if (p==null){
            return val;
        }
        if(p.left != null){
            val = Math.max(calculate_max_level(p.left,val-1),val);
        }
        if(p.right != null){
            val = Math.max(calculate_max_level(p.right,val+1),val);
        }
        return val;
    }

    static void print_by_vertical(bst.node p, int lvl, int mini, ArrayList<Integer> [] arr){
        if(p==null){
            return ;
        }

        arr[lvl-mini].add(p.val);


        if(p.left != null){
            print_by_vertical(p.left,lvl-1,mini,arr);
        }
        if(p.right != null){
            print_by_vertical(p.right,lvl+1,mini,arr);
        }
    }

    public static void main(String[] args) {
        bst tree = new bst();
        bst.insert(tree, 34);
        bst.insert(tree, 12);
        bst.insert(tree, 56);
        bst.insert(tree, 78);
        bst.insert(tree, 3);
        bst.insert(tree, 2);
        bst.insert(tree, 6);
        bst.insert(tree, 79);
        bst.insert(tree, 69);
        bst.insert(tree, 11);
        bst.insert(tree, 46);
        bst.insert(tree, 23);

        bst.node p = tree.root;
        int mini = calculate_min_level(p,0);
        int maxi = calculate_max_level(p,0);
        int size = maxi-mini+1;
        ArrayList<Integer>[] arr = new ArrayList[size];
        for (int i = 0; i < size; i++) arr[i] = new ArrayList<>();


        print_by_vertical(p,0,mini,arr);
        for(int i=0;i<size;i++){
            for(int j:arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }


}
