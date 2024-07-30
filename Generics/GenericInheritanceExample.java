// Base generic class
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// Derived generic class extending Box
class ColoredBox<T> extends Box<T> {
    private String color;

    public ColoredBox(T value, String color) {
        super(value);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Value: " + getValue() + ", Color: " + color;
    }
}

public class GenericInheritanceExample {
    public static void main(String[] args) {
        // Create a ColoredBox with Integer type
        ColoredBox<Integer> coloredBox = new ColoredBox<>(123, "Red");
        System.out.println(coloredBox);

        // Create a ColoredBox with String type
        ColoredBox<String> coloredBox2 = new ColoredBox<>("Hello", "Blue");
        System.out.println(coloredBox2);
    }
}
