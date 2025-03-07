// Sphere.java

class Sphere extends Shape implements VolumeInterface{
	public Sphere(double radius){
		super(radius,0,0,0);
	}

	@Override
	public double calculateArea(){
		return 4 * 3.14 * (dim_one * dim_one);
	}

	@Override
	public double calculatePerimeter(){ // Same as Circle
		return 2 * 3.14 *(dim_one);
	}

	@Override
	public double calculateVolume(){
		return (4.0 / 3.0)* 3.14 * ((dim_one) * (dim_one) *(dim_one));
	}

}