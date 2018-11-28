
/**
 * Write a description of class isPrime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class isPrime
{
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n == 2)        return true;
        else if (n < 2 || n % 2==0 ) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * Constructor for objects of class isPrime
     */
    public static int isPrime(int n)
    {
        int large = 0; 
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) 
            {
                large = i;
                System.out.println(large);
            }
        }
        
        return large;
    }
}
