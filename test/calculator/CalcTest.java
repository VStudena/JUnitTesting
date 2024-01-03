package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    Calc calc;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calc=new Calc();
    }

    @org.junit.jupiter.api.Test
    void sectiDveKladna() {
        Calc calc = new Calc();
        int actual = calc.Secti(10, 5);
        assertEquals(15, actual);
    }

    @org.junit.jupiter.api.Test
    void sectiDveZaporna() {
        Calc calc = new Calc();
        int actual = calc.Secti(-2, -5);
        assertEquals(-7, actual);
    }
    @org.junit.jupiter.api.Test
    void sectiDveNuly() {
        assertEquals(0,calc.Secti(0,0));
    }
}
