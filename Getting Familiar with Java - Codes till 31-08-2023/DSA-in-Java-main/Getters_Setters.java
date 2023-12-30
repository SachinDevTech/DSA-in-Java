class PEN {
    private int peices; 
    //Even though variables are private, the data stored in it can be accessed in main function by the help of getter function.
    private String color;

    String getColor() { //getter for color
        return this.color;
    }
    int getCount() { //getter for count of the pen
        return this.peices;
    }

    void setColor(String new_Color) { //setter for the pen color
        color = new_Color;
    }

    void setCount(int num_Peices) { //setter for the pen count
        peices = num_Peices;
    }
}

public class Getters_Setters {
    public static void main(String[] args) {
        PEN p1 = new PEN(); // Constructor
        p1.setColor("Red");
        p1.setCount(10);
        System.out.println("\nColor is: " + p1.getColor());
        System.out.println("Pen Peices are: " + p1.getCount() + "\n");

    }
}
