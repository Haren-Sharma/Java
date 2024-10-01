import shapes.Rectangle;

public class Area {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 20);
        int data = obj.area();
        System.out.println("Area of the rectangle is : " + data);
    }
}
