import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class warmUpTest {
    @Test
    @DisplayName("findThreeSums測試IllegalCase")
    void findThreeSumsIllegalCase() {
        assertThrows(IllegalArgumentException.class, () -> warmUp.findThreeSums(null));
        assertThrows(IllegalArgumentException.class, () -> warmUp.findThreeSums(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> warmUp.findThreeSums(new int[]{0, 1}));
        assertThrows(IllegalArgumentException.class, () -> warmUp.findThreeSums(new int[]{0, 0, 0, 0}));
    }
    @Test
    @DisplayName("findThreeSums測試IllegalCase")
        void findThreeSumsCase(){
        assertEquals(2, warmUp.findThreeSums(new int[]{-1,-2,3,-4,-5,9,10,11}));

    }


    @Test
    void findMaxAndMin(){
        assertThrows(IllegalArgumentException.class,() -> warmUp.findMaxAndMin(null));
        assertThrows(IllegalArgumentException.class,() -> warmUp.findMaxAndMin(new int[]{}));
        assertEquals(new Range(1, 5), warmUp.findMaxAndMin(new int[]{1, 2, 3, 4, 5}));
        assertEquals(new Range(1, 1), warmUp.findMaxAndMin(new int[]{1}));
    }
}