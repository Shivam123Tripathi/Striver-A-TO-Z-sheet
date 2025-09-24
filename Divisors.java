import java.util.*;
public class Divisors{

    static void printDivisors(int n){
        //brute force approach
        for(int i = 1; i<n; i++){
        if( n%i == 0){
            System.out.println(i);
        }
    }
}


public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt(); 
    printDivisors(n);
}
}

//divisor => a no that divied an interger perfectly 
// example => input 6, output - 1, 2, 3, 6