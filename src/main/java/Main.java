import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Figure> liste = new ArrayList<Figure>();

        liste.add(new Rechteck(4,5));
        liste.add(new Quadrat(3));
        liste.add(new Kreis(4,6));
        liste.add(new Ellipse(5,2));


        System.out.println("Datenanzeige nach Fläche sortiert: ");
        System.out.println("-----------------------------------");

        liste.sort(new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if(o1.area()==o2.area()){
                    return 0;
                }
                if(o1.area()<o2.area()){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));

        }

    }


}
