// Cube.java


class Cube extends Shape implements VolumeInterface{

	public Cube(double side){
		super(side,0,0,6);
	}

	@Override
	public double calculateArea(){
		return 6 * dim_one * dim_one;
	}


	@Override
	public double calculatePerimeter(){
		return 12 * dim_one;
	}


	@Override
	public double calculateVolume(){
		return dim_one * dim_one * dim_one;
	}

}