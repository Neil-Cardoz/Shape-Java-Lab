// Cylinder.java


class Cylinder extends Shape implements VolumeInterface{
	public Cylinder(double radius, double height){
		super(radius,height,0,0);
	}
	
	@Override
	public double calculateArea(){
		return (2 * 3.14 * dim_one) * (dim_one + dim_two);
	}


	@Override
	public double calculatePerimeter(){
		return 2 * ((2 * dim_one) + dim_two);
	}


	@Override
	public double calculateVolume(){
		return 3.14 * (dim_one * dim_one) * dim_two;
	}

}