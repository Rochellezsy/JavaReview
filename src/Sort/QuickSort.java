package Sort;

public class QuickSort {

    public void quicksort(int[]arr, int i, int j){
        if(i>=j) return;
        int p = partition(arr, i, j);
        quicksort(arr, i, p-1);
        quicksort(arr, p+1, j);
    }

    public int partition(int[]arr, int i, int j){
        int pivot = arr[0];
        int left = i+1;
        int right = j;
        while(true){
            while(left<=j && arr[left]<pivot){
                left++;
            }
            while(right>=0 && arr[right]>pivot){
                right--;
            }
            if(left>=right) break;
            swap(arr, left, right);
        }
        swap(arr, 0, right);
        return right;
    }

    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[]nums = {100,23,67,10,9,36};
        QuickSort test = new QuickSort();
        test.quicksort(nums, 0, nums.length-1);
        for(int num:nums){
            System.out.print(num+",");
        }
    }
}
