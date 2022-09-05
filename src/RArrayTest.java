import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RArrayTest {

   private  RArray object ;

    @Test
    @Before
    public void initializeCapacity() {
        this.object = new RArray(10);
    }
}
