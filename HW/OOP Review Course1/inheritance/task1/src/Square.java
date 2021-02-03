/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/

public class Square extends Shape {
    public Square(double length, String name) {
        super(name);
        this.width = length;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square))
            return false;

        Square other = (Square)o;
        return (other.name.equals(this.name) && other.length == this.length);
    }

    @Override
    public String toString() {
        return this.name + ":" + this.length;
    }
}