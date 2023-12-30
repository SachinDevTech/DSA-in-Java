
// This is function Overloading by using parameters
// public class G_FxN_Overloading {
//     public static int sum(int a, int b) {
//         return a + b;
//     }
   

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         System.out.println("Ans of two: " + sum(12, 13) + " ,\nSum of 3 is: " + sum(33, 33, 33) );
//     }
// }


// This is function Overloading by using Data Types

public class G_FxN_Overloading {
    public static int sum(int a, int b) {
        return a + b;
    }
   

    public static float sum(float a, float b) {
        return a + b ;
    }

    public static void main(String[] args) {
        System.out.println("Ans of two: " + sum(12, 13) + " ,\nSum of 3 is: " + sum(33.33f, 33.33f) );
    }
}
