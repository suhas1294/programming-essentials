package computations;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 30; i > 0; i--) {
            System.out.println(fact(i));
        }
    }
    static long fact(int n)
    {
        long output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = fact(n-1)* n;
        return output;
    }
}
