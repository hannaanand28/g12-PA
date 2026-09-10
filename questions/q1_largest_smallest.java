import java.util.*;
class Main {
    public static void f(int[] arr){
        int largest=arr[0];
        int smallest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest "+ largest);
        System.out.println("Smallest " + smallest);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        f(arr);
    }
}