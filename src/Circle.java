public class Circle extends Form{
    public float radius;

    public Circle() {
        radius = 0;
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return radius * radius * (float)Math.PI;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
