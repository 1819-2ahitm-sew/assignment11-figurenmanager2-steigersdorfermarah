public class Rechteck  extends Figure {


    private int laenge;
    private int breite;

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double area() {
        return (laenge * breite);
    }

    @Override
    public double circumference() {
        return (2 * laenge + 2 * breite);
    }

    @Override
    public String toString() {
        return "Rechteck mit der Laenge " + laenge + " und Breite "
                + breite + ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }

}
