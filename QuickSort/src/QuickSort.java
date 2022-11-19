public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {54, 30, 15, 5, 10, 25, 60};

        int size = arr.length;
        quickSort(arr, 0, size - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotElement = partition(array, low, high);
            quickSort(array, low, pivotElement - 1);
            quickSort(array, pivotElement + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        return i + 1;
    }
}
