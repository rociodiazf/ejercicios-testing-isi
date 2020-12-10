import java.util.*;

public class findLast
{
  /**
    * Find last index of element
    *
    * @param x array to search
    * @param y value to look for
    * @return last index of y in x; -1 if absent
    * @throws NullPointerException if x is null
    */
public static int findLast (int[] x, int y)
{
  for (int i=x.length-1; i > 0; i--)
  {
    if (x[i] == y)
    {
      return i;
    }
  }
  return -1;
}


  public static void main(String args[])
    {
        int arr[] = {5,4,0,5,2,1};
        int z = 5






















        ;
        int y = findLast.findLast (arr, z);
        System.out.println(y);
    }
}
