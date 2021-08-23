public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(arrayToString(array));
        System.out.println(searchLinear(array, 57));
        selectionSort(array);
        System.out.println(arrayToString(array));
        System.out.println(searchBinary(array, 57));
        System.out.println(searchBinaryRecursive(array, 0, array.length - 1, 57));
    }

    public static int searchLinear(int[] array, int elementToFind) {
        for (int i =0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    public static int searchBinary(int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            } else if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex -1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return  -1;
    }

    public static int searchBinaryRecursive(int[] array, int startIndex, int endIndex, int elementToFind) {
        if (endIndex >- startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            } else if (array[middleIndex] > elementToFind) {
                return searchBinaryRecursive(array, startIndex, middleIndex - 1, elementToFind);
            } else {
                return searchBinaryRecursive(array, middleIndex + 1, endIndex, elementToFind);
            }
        }
        return -1;
    }

    public static int[] selectionSort(int[] array) {
        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);
            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
        }
        return array;
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
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
