class Shape {
    public void printShape() {
        System.out.println("This is shape.");
    }
}

class Rectangle extends Shape {
    public void printShape() {
        System.out.println("This is rectangular shape.");
    }
}

class Circle extends Shape {
    public void printShape() {
        System.out.println("This is circular shape.");
    }
}

class Square extends Rectangle {
    public void printShape() {
        System.out.println("Square is a rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();  // This will call the method of 'Square' class
        square.super.printShape(); // This will call the method of 'Rectangle' class
        ((Shape)square).printShape(); // This will call the method of 'Shape' class
    }
}
