
/**
 * Write a description of class fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci
{
    /**
     * Constructor for objects of class multiples
     */
    public static int fibonacci()
    {
        int total = 0;
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i= 1; i< 4000000 ; i++)
        {
            System.out.println(i + "." + c);
            if (c%2 == 0)
            {
                total += c;
            }
            c = a + b;
            a = b;
            b = c;
            i = c;
        }
        return total;
    }
}
