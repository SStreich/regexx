import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.Random;

class RegexTest {

    @Test
    void testCalculateOverlap() {
        int[] data1 = {-1, -1, 10, 10, -1, 0, 3, 9};
        int[] data2 = {-12, -4, -1, -2, 0, 0, 100, 3000};
        Regex regex = new Regex();
        assertEquals(36, regex.calculateOverlap(data1));
        assertEquals(0, regex.calculateOverlap(data2));
    }

    @Test
    void checkIfCalculateOverlapHandlesWithWrongInput() {
        int[] data1 = {new Random().nextInt()};
        int[] data3 = {-1, -1, 10, 10, -1, 0, 3, 9-1, -1, 10, 10, -1, 0, 3, 9};
        Regex regex = new Regex();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            regex.calculateOverlap(data1);
        });
       assertThrows(IndexOutOfBoundsException.class, () -> {
            regex.calculateOverlap(data3);
        });
    }


}