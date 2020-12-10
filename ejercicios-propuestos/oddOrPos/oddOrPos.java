import java.util.*;

public class oddOrPos
{
  /**
    * Count odd or positive elements in an array
    *
    * @param x array to search
    * @return count of odd or positive elements in x
    * @throws NullPointerException if x is null
    */
  public static int oddOrPos (int[] x)
  {
    int count = 0;
    for (int i = 0; i < x.length; i++)
    {
      if (x[i]%2 == 1 || x[i] > 0 || x[i]%2 == -1)
      {
        count++;
      }
    }
    return count;
  }



  public static void main(String args[])
    {
        int arr[] = {1,-4,-4,2,-4,1};
        int y = oddOrPos.oddOrPos (arr);
        System.out.println(y);
    }
}
