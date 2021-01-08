package ÀýÌâ;

public class PolymorphismDemo {
	/** Main method */
	public static void main(String[] args) {
		//Display circle and rectangle properties
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"black",true));
	}
	
	/** Display geometric object properties */
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Create on "+ object.getDateCreated()+
				". Color is "+object.getColor());
	}
}
