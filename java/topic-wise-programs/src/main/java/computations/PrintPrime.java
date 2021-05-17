package computations;

public class PrintPrime {
    public static void main(String args[]){
        int start = 100;
        int end = 500;
        for (int i= start;i <= end; i++){
            boolean res = isPrime(i);
            if (res){System.out.print(i+"\t");}
        }
    }
    static boolean isPrime(int num){
        boolean result = false;
        int count = 0;
        for (int i=1; i<= num/2; i++){
            if (num%i == 0){
                count++;
            }
        }
        if (count == 1){
            result = true;
        }
        return result;
    }
}