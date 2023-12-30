public class _6_TypeConversion_Casting {
    public static void main(String[] args) {

        // Type conversion

        //byte->short->int->float->long->double
        //type-compatible
        //destination type > source type
        float percentile = 99.99f;
        int myPercentile = (int) percentile; // explicitely converted into integer type
        System.out.println(myPercentile); // this line will vanish the decimal precision value so in case of type conversion their happen possible lossy conversion.


        // Type Casting
        char ch = 'a';
        int num = ch; //here char is turned into int
        System.out.println("The ASCII value of " + ch + " is " + num);


        // It'll not produce any error.
        int $ = 24;
        System.out.println($);
    }
}
