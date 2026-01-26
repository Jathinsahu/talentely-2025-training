public class expression_tree {

    static class node<t> {
        t val;
        bst.node left;
        bst.node right;

        node(t d) {
            val = d;
            left = null;
            right = null;
        }
    }


}
