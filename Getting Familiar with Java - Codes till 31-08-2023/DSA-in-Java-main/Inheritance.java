public class Inheritance {
    public static void main(String[] args) {
        Deer d = new Deer();
        // d.set_animalColor("Yellow");
        // d.whatEats("Grass");
        d.set_animalColor("\nYelloww");
        d.whatEats("Ghaas\n");
        System.out.println(d.animalColor);
        System.out.println(d.what_ItEats);

    }
}

class Animal {
    String animalColor;
    String what_ItEats;

    void set_animalColor(String newColor) {

    }

    void whatEats(String eats) {

    }
}

class Deer extends Animal {
    void set_animalColor(String color) {
        animalColor = color;
    }

    void whatEats(String it_Eats) {
        what_ItEats = it_Eats;
    }
}