//write a program to check given number is prime or not 
//prime number is a number that is divisible by inly and itself
//example => 2, 3, 5, 7, 11, 13
public class PrimeNumber{
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        for(int i = 1; i<=num; i++){
            if(num%i == 0){
                count ++;
            }
        }
        if(count == 2){
             System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        
        
    }
}
