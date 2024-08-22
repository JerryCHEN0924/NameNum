import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameNumTest {

    @Test
    void isMatched() {
        assertThrows(IllegalArgumentException.class,() -> NameNum.isMatched("GREG",null));
        assertThrows(IllegalArgumentException.class,() -> NameNum.isMatched(null,"4734"));
        assertTrue(NameNum.isMatched("GREG","4734"));
        assertFalse(NameNum.isMatched("GREGE","4734"));
        assertFalse(NameNum.isMatched("GREG","4735"));
    }
}