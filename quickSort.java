public class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {

        int pivot = arr[0];
        int n = arr.length;

    for(int i = 1; i<n; i++){
        if(pivot>arr[i]){
            for(int j = i; j>0; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    return arr;
}