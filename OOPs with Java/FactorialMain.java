
import java.util.Scanner;

public class FactorialMain {

    public static long factorial(long n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter any num: ");
        Scanner sc = new Scanner(System.in);
        int numb=sc.nextInt();
        long fact=factorial(numb);
        System.out.println("Result"+fact);

    }
}
