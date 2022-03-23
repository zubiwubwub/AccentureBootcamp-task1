public class Day1 {

    byte byteExample;
    short shortExample;
    int intExample;
    long longExample;
    float floatExample;
    double doubleExample;
    boolean boolExample;
    char charExample;


    public void task1() {
        byteExample = 50;
        shortExample = 5000;
        intExample = 123456;
        longExample = 1234567890;
        floatExample = 456.8f;
        doubleExample = 45.7;
        boolExample = true;
        charExample = 't';

        System.out.println("Data type:"
                + "\n\tbyte = " + byteExample
                + "\n\tshort = " + shortExample
                + "\n\tint = " + intExample
                + "\n\tlong = " + longExample
                + "\n\tfloat = " + floatExample
                + "\n\tdouble = " + doubleExample
                + "\n\tboolean = " + boolExample
                + "\n\tchar = " + charExample);
    }
}
