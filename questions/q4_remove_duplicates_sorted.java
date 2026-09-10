import java.util.*;
class Main {
    public static int f(int[] arr){
       if(arr.length==0){
           return 0;
       }

       int writter =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[writter] = arr[i];
                writter++;
            }
        }
        return writter;
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
        System.out.print(f(arr));

    }
}