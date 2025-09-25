import java.util.*;
class Solutions{
    public static int [] divisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                divisors.add(i);
            }
        }
        int [] arr = new int [divisors.size()];
        for(int i = 0; i< divisors.size(); i++){
            arr[i]  = divisors.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int  n = 5;
        divisors(n);
    }
}


// public class ArrList{
//     public static void main(String[] args) {
//         int n = 5;
//         Solution obj = new Solution();
//         int[] result = obj.Divisors(n);
//         divisors(n);
//     }
// }