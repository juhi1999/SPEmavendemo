
import org.example.Main;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

        Main obj=new Main();
        @Test
        public void factoialTruePositive()
        {
            assertEquals("Finding factorial of a number for True Positive",120,obj.factoral( 5));
            assertEquals("Finding factorial of a number for True Positive",24,obj.factoral( 4));

        }

    }


