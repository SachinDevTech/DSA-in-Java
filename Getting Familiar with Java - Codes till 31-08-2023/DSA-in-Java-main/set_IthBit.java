public class set_IthBit {
    public static int setIthBit(int n, int i){
        return (n | 1<<i); // OR operation with a number having only the '
    }
    public static void main(String[] args) {
        System.out.println("\nAfter setting bit, Number is: "+ setIthBit(10,3)+"\n");
    }
}
