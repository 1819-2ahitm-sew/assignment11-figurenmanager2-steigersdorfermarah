public class Quadrat  extends Figure {

    private int seite;

    public Quadrat(int seite) {
        this.seite = seite;
    }

    @Override
    public double area() {
        return (seite * seite);
    }

    @Override
    public double circumference() {
        return (4 * seite);
    }

    @Override
    public String toString() {
        return "Quadrat mit der Seite " + seite +
                ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }
}
