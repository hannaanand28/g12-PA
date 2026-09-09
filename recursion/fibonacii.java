// multiple recursion call example 

// 0     1    1    2    3    5    8 13 21 34
// f(0) f(1) f(2) f(3) f(4) f(5) f(6)

// f(n)= f(n-1) + f(n-2)


import java.util.*;
class Main {
    public static int f(int n){
        if(n<=1){
            return n;
        }

        int last = f(n-1);
        int secondlast = f(n-2);
        return last + secondlast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}



// how multiple recusrion calls work?
// -> first call we be called and when its done then only the next recusrion call will work


//  time complexity = O(2^n) nearly not exactly so its kinda exponential in nature 