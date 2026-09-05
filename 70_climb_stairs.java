import java.util.*;

class Main {
    public static int climbStairs(int n) {
        if(n==1)
        return 1;

        if(n==2)
        return 2;

        int first = 1;
        int second = 2;
        for(int i=3;i<=n;i++){
            int current = first + second;
            first = second;
            second = current;

        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print the no. of stairs to climb ");
        int n=sc.nextInt();
        System.out.println("No. of ways are "+ climbStairs(n));
        // sc.close();
    }
}