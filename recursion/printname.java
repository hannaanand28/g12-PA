import java.util.*;
class Main {
    public static void func(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Hanna");
        func(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(1,n);
    }
}

// time complexity is O(N)