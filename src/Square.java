public class Square extends Form{
    public float side;

    public Square() {
        side = 0;
    }

    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
