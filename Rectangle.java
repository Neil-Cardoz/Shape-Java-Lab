// Rectangle.java

class Rectangle extends Shape{

	public Rectangle(double length, double breadth){
		super(length, breadth,0,4);
	}

	@Override
	public double calculateArea(){
		return dim_one * dim_two;
	}


	@Override
	public double calculatePerimeter(){
		return 2 * (dim_one + dim_two);
	}

}