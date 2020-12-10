import org.junit.*;
import static org.junit.Assert.*;
import java.lang.Object;
import java.util.*;

public class oddOrPosTest
{


  @Test
  public void testForNullArray()
  {
    int arr[] = null;
     try {
        oddOrPos.oddOrPos (arr);
     } catch (NullPointerException e) {
        return;
     }
     fail ("NullPointerException expected");
  }

  @Test
  public void testCorrectSearch()
  {
     int arr[] = {2, 5,0};
     assertEquals("Count of positive and odd", 2, oddOrPos.oddOrPos (arr));
  }

  @Test
  public void testNoNumbers()
  {
     int arr[] = {};
     assertEquals("Count of positive", 0, oddOrPos.oddOrPos (arr));
  }

  @Test
  public void testOddNegatives()
  {
      int arr[] = {-3, -1, -5,-7};
      assertEquals("Count of positive", 4, oddOrPos.oddOrPos (arr));
  }


  @Test
  public void testNoNumOddNeg()
  {
      int arr[] = {4,0, 5,-4,0 };
      assertEquals("Count of positive", 2, oddOrPos.oddOrPos (arr));
  }


}
