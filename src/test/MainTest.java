import org.example.Main;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class MainTest {

    @Test
    void getNum() {
        Main m = new Main();
        assertEquals(2, m.getNum(3));
    }
}