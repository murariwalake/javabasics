package org.example.e4.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        //print true false
        boolean a = true;
        System.out.println("a = " + a);

        //add two byte
        byte b = 10;
        byte c = 20;
        int byteSum = b + c;
        System.out.println("byteSum = " + byteSum) ;

        //add two shorts
        short d = 10;
        short e = 30;
        int shortSum = d + e;
        System.out.println("shortSum = " + shortSum);

        //add two ints

        //add two longs
        long f = 200;
        long g = 240;
        long longSum = f + g;
        System.out.println("longSum = " + longSum);

        //Add two floats
        float h = 10.05f;
        float i = 22.5f;
        float floatSum = h + i;
        System.out.println("floatSum = " + floatSum);

        //Add two doubles
        double j = 100.8;
        double k = 200.6;
        double doubleSum = j + k;
        System.out.println("doubleSum = " + doubleSum);

        //calculate area of triangle given height and breadth of triangle
        float height = 10.5f;
        float breadth = 15.5f;
        float areaOfTriangle = (1/2.0f) * height * breadth;
        System.out.println("areaOfTriangle = " + areaOfTriangle);

        displayMinAndMaxValuesOfTypes();

    }

    /**
     * Displays min and max values of each data type except boolean
     */
    private static void displayMinAndMaxValuesOfTypes() {
        printRange(Byte.SIZE, "byte");
        printRange(Short.SIZE, "short");
        printRange(Character.SIZE, "char");
        printRange(Integer.SIZE, "int");
        printRange(Long.SIZE, "long");
        printRange(Float.SIZE, "float");
        printRange(Double.SIZE, "double");
    }

    private static void printRange(int size, String type) {
        System.out.println(type + " : " + (long)(-Math.pow(2, size-1 )) + " to " + (long)(Math.pow(2, size-1) - 1));
    }
}
