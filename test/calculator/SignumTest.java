package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignumTest {

    Signum sig;

    static final double DELTA=0.00001;
    @BeforeEach
    void setUp() {
        sig=new Signum();
    }

    @Test
    void getSignumKladne() {
        assertEquals(1,sig.getSignum(10),DELTA);
    }
    @Test
    void getSignumNula() {
        assertEquals(0,sig.getSignum(0),DELTA);
    }
    @Test
    void getSignumZaporne() {
        assertEquals(-1,sig.getSignum(-100),DELTA);
    }

    @Test
    void testGetSignumStrKladne() {
        assertEquals(1,sig.getSignum("5"),DELTA);
    }
    @Test
    void testGetSignumStrZaporne() {
        assertEquals(-1,sig.getSignum("-15"),DELTA);
    }
    @Test
    void testGetSignumStrNula() {
        assertEquals(0,sig.getSignum("0"),DELTA);
    }
    @Test
    void testGetSignumStrPismeno() {
        assertThrows(NumberFormatException.class,()->{double actual= sig.getSignum("n");});
    }
}