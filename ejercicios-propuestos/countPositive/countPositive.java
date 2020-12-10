import java.util.*;

public class countPositive
{
  /**
  * Counts positive elements in array
  *
  * @param x array to search
  * @return number of positive elements in x
  * @throws NullPointerException if x is null
  */
  public static int countPositive (int[] x)
  {
    int count = 0;
    for (int i=0; i < x.length; i++)
      {
        if (x[i] >= 0 && x[i]!= 0)
        {
          count++;
        }
      }
      return count;
  }

  public static void main(String args[])
    {
        int arr[] = {2, 4, -9,5,-4};
        int y = countPositive.countPositive (arr);
        System.out.println(y);
    }
}
