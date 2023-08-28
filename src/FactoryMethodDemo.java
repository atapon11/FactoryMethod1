
public class FactoryMethodDemo {

	public static void main(String[] arge) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("triangle");
		//Shape shape1 = new Circle();
		shape1.draw();
	}
}
