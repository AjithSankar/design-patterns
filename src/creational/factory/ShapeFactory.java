package creational.factory;

public class ShapeFactory {

    public Shape getShapeInstance(String value) {

        if (value.equals("Circle")) {
            return new Circle();
        }

        if (value.equals("Square")) {
            return new Square();
        }

        return null;
    }
}
