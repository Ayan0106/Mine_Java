// B) Define a class named ComparableCircle that extends Circle and implements Comparable. 
//   Implement the compareTo method to compare the circles on the basis of area.
//   Write a class to find the larger of two instances of ComparableCircle objects.

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// The subclass that adds "Comparison" powers
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius); 
    }

    @Override
    public int compareTo(ComparableCircle other) {
        if (this.getArea() > other.getArea()) {
            return 1;  
        } else if (this.getArea() < other.getArea()) {
            return -1; 
        } else {
            return 0;  
        }
    }
}

public class Test2 {
     public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(7);

        int result = c1.compareTo(c2);

        if (result > 0)
            System.out.println("Circle 1 is larger");
        else if (result < 0)
            System.out.println("Circle 2 is larger");
        else
            System.out.println("Both circles are equal");
    }
}
