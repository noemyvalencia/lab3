import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReverseInPlace2(){
    int[] in = {3, 8, 45, 79};
    ArrayExamples.reverseInPlace(in);
    assertArrayEquals(new int[]{79, 45, 8, 3}, in);
  }
  @Test
  public void testReversed2(){
    int[] in2 = {3, 0, 100, 25, 38};
    assertArrayEquals(new int[]{38, 25, 100, 0, 3}, ArrayExamples.reversed(in2));
  }
}
