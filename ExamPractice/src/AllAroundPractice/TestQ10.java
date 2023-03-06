package AllAroundPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestQ10 {

    @Test
    void q10() {
        int a = 30;
        int b = 15;
        int c = 98;
         assertTrue(Targilim.Q10(a));
         assertFalse(Targilim.Q10(b));
         assertFalse(Targilim.Q10(c));
    }
}