public class Tests {
    public static void main(String[] args) {
        stackTest();
    }

    public static void stackTest() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            stack.push(i);
        }
        System.out.println("\n");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
