//merge sort
public class Main {
    public static void main(String[] args) {
        int[] arr = {54, 30, 15, 5, 10, 25, 60};
        mergeSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int arrLength) {

        if (arrLength < 2){
            return;
        }
        int middle = arrLength / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arrLength - middle];

        int k = 0;
        for (int i = 0; i < arrLength; i++) {
            if (i < middle){
                leftArray[i] = arr[i];
            }else {
                rightArray[k] = arr[i];
                k++;
            }
        }
        mergeSort(leftArray,middle);
        mergeSort(rightArray,arrLength - middle);
        merge(leftArray, rightArray,arr , middle, arrLength - middle);
    }

    public static void merge(int[] leftArray,int[] rightArray,int[] array,
                             int leftArraySize, int rightArraySize){
        int i = 0;
        int l = 0;
        int r = 0;
        while (l < leftArraySize && r <rightArraySize){
            if (leftArray[l] < rightArray[r]){
                array[i++] = leftArray[l++];
            }else {
                array[i++] = rightArray[r++];
            }
        }
        while (l < leftArraySize){
            array[i++] = leftArray[l++];
        }
        while (r < rightArraySize){
            array[i++] = rightArray[r++];
        }

    }
}

