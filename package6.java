public class ArrayDeleteElement {

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int index = 2;

        int[] modifiedArray = deleteElement(array, index);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Modified array: " + Arrays.toString(modifiedArray));
    }

    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] modifiedArray = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            modifiedArray[i] = array[i];
        }

        for (int i = index + 1; i < array.length; i++) {
            modifiedArray[i - 1] = array[i];
        }

        return modifiedArray;
    }
}