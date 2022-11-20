public class Main {
    public static void main(String[] args) {
        int[] arr = {54, 30, 15, 5, 10, 25, 60};
        int n = arr.length;

        countSort(arr,n);
    }

    private static int getMaxElement(int[] arr,int n){
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    private  static  void  countSort(int[] arr, int n){
        int[] output = new int[n + 1];
        int maxElement = getMaxElement(arr,n);

        int[] count = new int[maxElement + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= maxElement; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0 ; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
