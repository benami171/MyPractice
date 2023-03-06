package AllAroundPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPalindrome() {
      String f1 = "MOTEK";
      String f2 = "MOTOM";
      assertTrue(Targilim.isPalindrome(f2));
      assertFalse(Targilim.isPalindrome(f1));

    }


    @Test
    void d_range() {
        int a = 27;
        int b = 5;
        int[] ansB = new int[]{};
        int[] ansA = new int[]{24, 25, 26, 27, 28};
        assertArrayEquals(ansA,Targilim.d_range(a));
        assertArrayEquals(ansB,Targilim.d_range(b));
    }

    @Test
    void isPer() {
        ArrayList<String> words = new ArrayList<>();
        words.add("aa");
        words.add(" b b ");
        words.add("c");
        String line = new String("aca bb");


        assertFalse(Targilim.isPer(words,line));

    }

    @Test
    void isPer2() {
        ArrayList<String> words = new ArrayList<>();
        words.add("aa");
        words.add(" b b ");
        words.add("c");
        String line2 = new String("aabbc");

        assertFalse(Targilim.isPer(words,line2));
    }
}