import java.util.*;

class Main {
    public static void buublesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            //yahan pr j<n-i-1 isliye use ho rha h because hum sabse bade element ko last tak leke ja rhe h and last tak pahunchke hame uski need nhi h so vo vahan or fix ho rha hai
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,8,4,2};
        buublesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}