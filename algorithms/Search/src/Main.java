public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(array));
        System.out.println(searchLinear(array, 57));
    }

    public static int searchLinear(int[] array, int elementToFind) {
        for (int i =0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
