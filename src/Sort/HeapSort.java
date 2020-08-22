package Sort;

public class HeapSort {
    private int[]a;
    private int size;

    public HeapSort(int capacity){
        this.a = new int[capacity+1];
        this.a[0] = Integer.MAX_VALUE;
        this.size = 0;
    }

    public boolean isEmpty(){
        if(size==0){
            System.out.println("heap is empty");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size==a.length-1){
            System.out.println("heap is full");
            return true;
        }
        return false;
    }

    public void insert(int val){
        if(isFull()){
            System.out.println("insert failed");
        }
        size++;
        a[size]=val;
        swim(size);
    }

    public int popMax(){
        if(isEmpty()){
            System.out.println("pop failed");
            return -1;
        }
        int temp=a[size];
        size--;
        int max = a[1];
        a[1]=temp;
        sink(1);
        return max;
    }

    public void swim(int k){
        while(a[k]>a[k/2]){
            swap(k,k/2);
            k=k/2;
        }
    }

    public void sink(int k){
        while(2*k<=size){
            int child = k*2;
            if(child<size && a[child]<a[child+1]){
                child++;
            }
            if(a[child]>a[k]){
                swap(child, k);
                k = child*2;
            }
            else{
                break;
            }
        }
    }

    public void swap(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void print(){
        for(int i=1; i<=size; i++){
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]nums = {100,45,28,93,4,101};
        HeapSort test=new HeapSort(6);
        for(int num:nums){
            test.insert(num);
        }
        test.print();
        System.out.println(test.popMax());
        test.print();
        System.out.println(test.popMax());
        test.print();
        System.out.println(test.popMax());
        test.print();
    }

}
