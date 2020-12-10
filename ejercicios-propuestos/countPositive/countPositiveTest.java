import org.junit.*;
import static org.junit.Assert.*;
import java.lang.Object;
import java.util.*;

public class countPositiveTest
{


  @Test
  public void testForNullArray()
  {
    int arr[] = null;

     try {
        countPositive.countPositive (arr);
     } catch (NullPointerException e) {
        return;
     }
     fail ("NullPointerException expected");
  }

  @Test
  public void testCorrectCount()
  {
     int arr[] = {2, 5,1,-6};
     assertEquals("Count of positive", 3, countPositive.countPositive (arr));
  }

  @Test
  public void testCorrectCount2()
  {
     int arr[] = {};
     assertEquals("Count of positive", 0, countPositive.countPositive (arr));
  }

  @Test
  public void testZeroPositive()
  {
     int arr[] = {0, 4, 0,5,-4};
     assertEquals("Count of positive", 2, countPositive.countPositive (arr));
  }

}
