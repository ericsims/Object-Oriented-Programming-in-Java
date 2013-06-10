
public class TestRectange {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("A rectangle with a width of " + rectangle1.width 
				+ " and a height of " + rectangle1.height 
				+ " has a perimeter of " + rectangle1.getPerimeter() 
				+ " and an area of " + rectangle1.getArea() + ".");
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("A rectangle with a width of " + rectangle2.width 
				+ " and a height of " + rectangle2.height 
				+ " has a perimeter of " + rectangle2.getPerimeter() 
				+ " and an area of " + rectangle2.getArea() + ".");
	}

}
