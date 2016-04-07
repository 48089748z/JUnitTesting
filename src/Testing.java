import static org.junit.Assert.*;

/**
 * Created by 48089748z on 07/04/16.
 */
public class Testing {
    @org.junit.Test
    public void testing() throws Exception {
        ToBeTested toBeTested = new ToBeTested();

        assertEquals(3, (Object) toBeTested.suma(1, 2));

        assertEquals(1, (Object) toBeTested.resta(2, 1));

        assertEquals(4, (Object) toBeTested.multiplicacio(2, 2));

        assertEquals(5, (Object) toBeTested.divisio(10, 2));
    }
}

