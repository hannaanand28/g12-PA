// print 1 to n
import java.util.*;
class Main {
    public static void func(int i,int n){
        if(i<1){
            return;
        }
        func(i-1,n);
        System.out.println(i);
        // see yahan pr esa hoga sabse phle function call hota jayega
        //lets take an example we take 3,3 . phle  jayega vo function i-1 mai jayega and 2,3 call hoga , uske baad 1,3 and uske baad 0,1 . AS we can see i<1 h toh statement return ho jayegi and 1,2 vala function khatam ho jayega and 1 print ho jayega , vaise he 1 print hote h 1,3, vala function jo 2,3 mai call hua tha vo khatam ho jayega and function khatam ho jayega 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(1,n);
    }
}