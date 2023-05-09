package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.fail;

class MainTest {

    @Test
    void getNum() {
        Main m = new Main();
        assertEquals(3, m.getNum(3));
    }

    private void assertEquals(int i, int num) {
        if(i != num) {
            fail();
        }
    }
}