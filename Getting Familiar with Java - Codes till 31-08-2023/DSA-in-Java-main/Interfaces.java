public class Interfaces {
    public static void main(String[] args) {
        King k1 = new King();
        k1.moves();
    }
}

interface chessPlayer{
   void moves(); //interface basically gives an idea not implementation
}

class Queen implements chessPlayer{
    public void moves(){ //moves definiton for Queen is implemented here
        System.out.println("up, left, right, down - (in all 4 directions)");
    }
}
class Rook implements chessPlayer{
    public void moves(){//moves definiton for Rook is implemented here
        System.out.println("up, left, right, down");
    }
}
class King implements chessPlayer{
    public void moves(){//moves definiton for King is implemented here
        System.out.println("up, left, right, down - (By one step)");
    }
}


// interface gives only an idea about the about properties
//implementation of that idea can be written in the subclasses
