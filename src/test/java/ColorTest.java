import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tddcolor.Color;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    @Test
    @DisplayName("Test if the number provided to perameters is less than 0 or bigger than 1 ")
     void numbersLess0AndBigger1ShouldReturnIllegalArgumentExcep(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Color color1 = new Color(1.2f,0.5f, 1.0f);
                });
    }
    @Test
    @DisplayName("Test if Blue components bits from 0-7")
    void testBlueComponentBits(){
        var color2 = new Color(0x112233);
        assertEquals(0x33, color2.getBlue());

    }
    @Test
    @DisplayName("Test if Green components bits from 8-15")
    void testGreenComponentBits(){
        var color4 = new Color(0x112233);

        assertEquals(0x22, color4.getGreen());

    }
    @Test
    @DisplayName("Test if Red components bits from 16-23")
    void testRedComponentBits(){
        var color3 = new Color(0x112233);

        assertEquals(0x11, color3.getRed());

    }
    @Test
    @DisplayName("Test if two colors contains different RBG components they considered not equal")
    void testDifferentColourRBGComponentsNotEqual(){
        Color color4 = new Color(0x112233);
        Color color5 = new Color(0x145233);
        assertFalse(color4.equals(color5));


    }
    @Test
    @DisplayName("Test if two colors contains same RBG components they considered equal")
    void testSameColourRBGComponentsEqual(){
        Color color4 = new Color(0x112233);
        Color color5 = new Color(0x112233);
        assertTrue(color4.equals(color5));

    }
}