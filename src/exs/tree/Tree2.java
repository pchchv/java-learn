package exs.tree;

import exs.stack_and_queue.SimpleQueue;
public class Tree2 {
    public static void main(String[] args) {
        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35,
                        new Tree(31, new Tree(28), null),
                        new Tree(40, new Tree(38), new Tree(52))));
        System.out.println("Сумма дерева: " + sumWide(root));
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Tree (int value) {
            this.value = value;
        }
    }

    public static int sumRecursive(Tree root) {
        int summ = root.value;
        if (root.left != null) {
            summ += sumRecursive(root.left);
        }
        if (root.right != null) {
            summ += sumRecursive(root.right);
        }
        return summ
    }

    public static int sumWide(Tree root) {
        SimpleQueue<Tree> queue = new SimpleQueue<>();
        queue.add(root);
        int summ = 0;
        while (!queue.isEmpty()) {
            Tree node = queue.remove();
            System.out.println(node.value);
            summ = summ + node.value;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return summ;
    }
}
