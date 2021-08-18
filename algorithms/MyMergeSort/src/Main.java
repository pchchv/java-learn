import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{15, 78, 89, 9, 12, 12546, 8, 879, 16, 54, 1};
        System.out.println(arrayToString(array));
        array = mergeSort(array);
        System.out.println(arrayToString(array));
    }

    public static int[] mergeSort(int[] array) {
        int[] array1 = Arrays.copyOfRange(array, 0, array.length/2);
        int[] array2 = Arrays.copyOfRange(array, array1.length, array.length);
        if (array1.length > 1) {
            array1 = mergeSort(array1);
        }
        if (array2.length > 1) {
            array2 = mergeSort(array2);
        }
        int[] resultArray = new int[array.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (index2 == array2.length || index1 < array1.length && array1[index1] <= array2[index2]) {
                resultArray[i] = array1[index1];
                index1++;
            } else if (index1 == array1.length || array1[index1] >= array2[index2]) {
                resultArray[i] = array2[index2];
                index2++;
            }
        }
        System.out.println(arrayToString(resultArray));
        return resultArray;
    }

    public static String arrayToString(int[] array) {
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
