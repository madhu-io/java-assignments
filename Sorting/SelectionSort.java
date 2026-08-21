class SelectionSort {

    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);

        sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}