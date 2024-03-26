// Interface in the package Quad1
package Quad1;

public interface QuadraticEquation {
    void findRoots(double a, double b, double c);
}

______________________

// Implementation of the interface in the package Quad2
package Quad2;
import Quad1.QuadraticEquation;

public class QuadraticEquationImpl implements QuadraticEquation {
    @Override
    public void findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}

______________________

// Main class to use the interface and implementation
import Quad1.QuadraticEquation;
import Quad2.QuadraticEquationImpl;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquationImpl();
        equation.findRoots(1, -3, 2); // Example quadratic equation: x^2 - 3x + 2 = 0
    }
}
