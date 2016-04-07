import static org.junit.Assert.*;

/**
 * Created by 48089748z on 07/04/16.
 */
public class Testing
{
    @org.junit.Test
    public void testSuma() throws Exception
    {
        assertEquals(3, 1, 2);  //1+2=3
        assertEquals(4, 2, 2);  //2+2=4
        assertEquals(2, 1, 1);  //1+1=2
    }

    @org.junit.Test
    public void testResta() throws Exception
    {
        assertEquals(2, 4, 2);  //4 - 2 = 2
    }
}