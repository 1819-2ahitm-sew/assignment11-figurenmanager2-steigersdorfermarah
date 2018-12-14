public class Kreis extends Figure {

    private int koordinateMP;
    private int radius;


    public Kreis(int koordinateMP, int radius) {
        this.koordinateMP = koordinateMP;
        this.radius = radius;
    }

    @Override
    public double area(){
        return (Math.PI * (radius*radius));
    }

    @Override
    public double circumference(){
        return (2 * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "Kreis mit dem Radius " + radius +
                ": Flaeche -> " + area() + ", Umfang -> " + circumference();

    }

}
