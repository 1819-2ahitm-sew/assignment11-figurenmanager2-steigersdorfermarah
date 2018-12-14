import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Figure> liste = new ArrayList<Figure>();

        liste.add(new Rechteck(4,5));
        liste.add(new Quadrat(3));
        liste.add(new Kreis(4,6));
        liste.add(new Ellipse(5,2));

    }


}
