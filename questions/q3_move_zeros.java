import java.util.*;
class Main {
    public static void f(int[] arr){
       int insertpost = 0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               int temp = arr[insertpost];
               arr[insertpost]=arr[i];
               arr[i]=temp;

               insertpost++;
           }
       }
    }

    public static void display(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        f(arr);
        display(arr);
    }
}