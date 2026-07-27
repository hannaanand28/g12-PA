import java.util.*;

class Main {
    public static void selectionsort(int[] arr){
       for(int i=0;i<arr.length-1;i++){
           int min = i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
       }
    }
    public static void main(String[] args) {
        int arr[] = {9,4,7,1,5,2};
        int k=3;
        selectionsort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));
        System.out.println("Element at " + k + ": "+ arr[k-1]);
    }
}