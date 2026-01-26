public class inorder_wtout_recursion {
    public static void main(String[] args) {
        bst tree = new bst();
        bst.insert(tree, 8);
        bst.insert(tree, 5);
        bst.insert(tree, 9);
        bst.insert(tree, 4);
        bst.insert(tree, 7);
        bst.insert(tree, 14);
        bst.insert(tree, 6);
        bst.insert(tree, 10);
        bst.insert(tree, 12);
        bst.insert(tree, 13);

        bst.node p = tree.root;

        stk<bst.node> stack = new stk<>();
        stack.push(p);
        while(!stack.isempty()){
            bst.node curr = stack.pop();
            System.out.print(curr.val+" ");
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
    }
}
