import java.util.*;

public class lastZero
{
  /**
    * Find LAST index of zero
    *
    * @param x array to search
    * @return index of last 0 in x; -1 if absent
    * @throws NullPointerException if x is null
    */
  public static int lastZero (int[] x)
  {
    for (int i = x.length-1; i >= 0; i--)
    {
      if (x[i] == 0)
      {
        return i;
      }
    }
    return -1;
  }


  public static void main(String args[])
    {
        int arr[] = {3,4,0,6,2,1};
        int y = lastZero.lastZero (arr);
        System.out.println(y);
    }
}
