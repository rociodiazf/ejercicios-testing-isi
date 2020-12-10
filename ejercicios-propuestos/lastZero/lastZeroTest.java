import org.junit.*;
import static org.junit.Assert.*;
import java.lang.Object;
import java.util.*;

public class lastZeroTest
{


  @Test
  public void testForNullArray()
  {
    int arr[] = null;

     try {
        lastZero.lastZero (arr);
     } catch (NullPointerException e) {
        return;
     }
     fail ("NullPointerException expected");
  }

  @Test
  public void testCorrectSearch()
  {
     int arr[] = {2, 5,0,-6};
     assertEquals("Count of positive", 2, lastZero.lastZero (arr));
  }

  @Test
  public void testNoNumbers()
  {
     int arr[] = {};
     assertEquals("Count of positive", -1, lastZero.lastZero (arr));
  }

  @Test
  public void testNoZeros()
  {
     int arr[] = {4,5,-4};
     assertEquals("Count of positive", -1, lastZero.lastZero (arr));
  }

  @Test
  public void test2Zeros()
  {
     int arr[] = {4,0, 5,-4,0 };
     assertEquals("Count of positive", 4, lastZero.lastZero (arr));
  }

}
