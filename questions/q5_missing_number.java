import java.util.*;
class Main {
    public static int f(int[] arr){
       if(arr.length==0){
           return 0;
       }

        int largest=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(arr[i] > largest){
                largest = arr[i];
            }

        }
        int sum2=0;
        for(int i=0;i<=largest;i++){
            sum2+=i;
        }
        return sum2-sum;
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