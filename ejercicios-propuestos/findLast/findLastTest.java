import org.junit.*;
import static org.junit.Assert.*;
import java.lang.Object;
import java.util.*;

public class findLastTest
{


  @Test
  public void testForNullArray()
  {
    int arr[] = null;
    int z = 4;

     try {
        findLast.findLast (arr,z);
     } catch (NullPointerException e) {
        return;
     }
     fail ("NullPointerException expected");
  }

  @Test
  public void testCorrectSearch()
  {
     int arr[] = {2, 5,0,-6};
     int z = 4;
     assertEquals("The good resul", -1, findLast.findLast (arr, z));
  }

  @Test
  public void testNoNumbers()
  {
     int arr[] = {};
     int z = 4;
     assertEquals("No numbers", -1, findLast.findLast (arr,z));
  }

  @Test
  public void testNoIndexInArray()
  {
      int z = 6;
      int arr[] = {4,5,-4};
      assertEquals("No found", -1, findLast.findLast (arr,z));
  }

  @Test
  public void testFirstElement()
  {
      int z = 6;
      int arr[] = {6,5,-4};
      assertEquals("First element of array", 0, findLast.findLast (arr,z));
  }

  @Test
  public void testLastElement()
  {
      int z = -4;
      int arr[] = {6,5,-4};
      assertEquals("Last element of array", 2, findLast.findLast (arr,z));
  }


  @Test
  public void test2Index()
  {
      int z = 0;
      int arr[] = {4,0, 5,4,0 };
      assertEquals("More than one", 4, findLast.findLast (arr,z));
  }


}
