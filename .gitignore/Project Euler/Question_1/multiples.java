
/**
 * Write a description of class multiples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class multiples
{
    /**
     * Constructor for objects of class multiples
     */
    public static int multiples(int start, int finish)
    {
        int total = 0;
        for(int i= start; i< finish ; i++)
        {
            if (i%3 == 0 || i%5 == 0)
            {
                total += i;
            }
        }
        return total;
    }
}
