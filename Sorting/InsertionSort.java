import java.util.*;

class InsertionSort {

    void sort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        int n = arr.length;
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num%2!=0){
                list.add(num);

            }
        }arr= new int[0];
        System.out.println("Created new Array: ");

        System.out.print(list);
    }
}
