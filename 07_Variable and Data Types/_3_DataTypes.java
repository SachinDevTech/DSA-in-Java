public class _3_DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types - int, long, float, double, boolean, byte, short, char.
        // Non-Primitive Data Type - String, Array, class, object and Interface.

        // For Ex.

        byte num = 127; //1-byte data type which ranges from [-127, 128], Values out of this range can't be holded by this byte datatype.
        System.out.println(num);

        short shortValue = 222; //The short data type is a 2-byte data type. It has a minimum value of -32,768 and a maximum value of 32,767

        char ch = 'S'; // it takes 2-byte
        System.out.println(ch);

        boolean boolValue = true; //1-byte
        System.out.println(boolValue);

        int count = 5; //4-byte
        System.out.println(count);
        
        long longValue = 999999999; //8-bytes
        System.out.println(longValue);

        float floatValue = 4.4f; //Without f after the value it'll be treated as double data type so make sure while using it.
        System.out.println(floatValue);// takes 4-byte

        double doubleValue = 4.4444; //takes 8-byte
        System.out.println(doubleValue);


        // Non-Primitive Data Types will be covered in upcoming videos.
    }
}
