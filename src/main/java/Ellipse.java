public class Ellipse extends Figure {

    private int hauptachse;
    private int nebenachse;

    public Ellipse(int hauptachse, int nebenachse) {
        this.hauptachse = hauptachse;
        this.nebenachse = nebenachse;
    }

    @Override
    public double area() {
        return (hauptachse * nebenachse * Math.PI);
    }

    @Override
    public double circumference() {
        return (Math.PI * Math.sqrt(2 * (Math.pow(hauptachse, 2) + Math.pow(nebenachse, 2))));
    }


    @Override
    public String toString() {

        return "Ellipse mit der Hauptachse " + hauptachse + " und der Nebenachse " + nebenachse +
                ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }

}
