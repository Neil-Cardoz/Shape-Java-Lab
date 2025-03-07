// Equilateral Pyramid.java

import java.lang.*;
class EquilateralPyramid extends Shape implements VolumeInterface {
	public EquilateralPyramid(double side, double height){
		super(side,height,0,0);
	}

	@Override
	public double calculateArea(){
		return dim_one * (dim_one + Math.sqrt(dim_one * dim_one + 4 * dim_two * dim_two));
	}


	@Override
	public double calculatePerimeter(){
	return 4 * (dim_one);
}

	@Override
	public double calculateVolume(){
	return (1.0 / 3.0) * (dim_one * dim_one) * dim_two;
}

}