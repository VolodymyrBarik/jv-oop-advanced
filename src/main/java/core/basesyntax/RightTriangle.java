package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (firstLeg / 2) * secondLeg;
    }

    @Override
    public String toDraw() {
        return "Figure: rigthTriangle, area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor();
    }
}
