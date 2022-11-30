package org.tddcolor;

import java.util.Objects;

public class Color {


    private  float red;
    private  float green;
    private float blue;

    private int rgb;



    public  Color(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        try {
            // If number is out of range, throw exception if not, return the argument.
            if (red < 0.0 || red > 1.0) {
                throw new IllegalArgumentException("\nNot a valid argument...");
            } else if (green < 0.0 || green > 1.0) {
                throw new IllegalArgumentException("\nNot a valid argument...");
            } else if (blue < 0.0 || blue > 1.0) {
                throw new IllegalArgumentException("\nNot a valid argument...");
            }

        } catch (IllegalArgumentException exception) {

            //  message thrown in the exception.
            throw new IllegalArgumentException("numbers has to be in the range 0-1");

        }
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", rgb=" + rgb +
                '}';
    }

    public Color(int rgb){
        this.rgb = rgb;
        setRed((rgb >> 16) & 0xFF);
        setGreen((rgb >> 8) & 0xFF);
        setBlue(rgb & 0xFF);
    }


    public int getRgb() {
        return rgb;
    }

    public void setRgb(int rgb) {
        this.rgb = rgb;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color color)) return false;
        return Float.compare(color.getRed(), getRed()) == 0 && Float.compare(color.getGreen(), getGreen()) == 0 && Float.compare(color.getBlue(), getBlue()) == 0 && getRgb() == color.getRgb();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRed(), getGreen(), getBlue(), getRgb());
    }





    public float getRed() {
        return red;
    }

    public void setRed(float red) {
        this.red = red;
    }

    public float getGreen() {
        return green;
    }

    public void setGreen(float green) {
        this.green = green;
    }

    public float getBlue() {
        return blue;
    }

    public void setBlue(float blue) {
        this.blue = blue;
    }
}