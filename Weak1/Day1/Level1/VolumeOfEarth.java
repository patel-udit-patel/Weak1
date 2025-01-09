public class VolumeOfEarth{

	//function for calculation of volume at radius
	public static double volume(float radius){
		float PI=3.14f;

		//calculating volume
public class DiscountedAmount{
	public static void main(String[]args){

		//Initialising fee 
		int fee=125000;

		//Initialising discount percentage
		int discountPercent=10;

		//Calculating discount 
		int discount=fee*discountPercent/100;

		//Printing discount and discounted amount
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}


		double volume=PI*radius*radius*radius*(4.0f/3.0f);

		return volume;
	}

	public static void main(String[]args){
		float radiusOfEarth=6378.00f;

		//Calculating radius of earth into miles
		float radiusOfEarthInMiles=radiusOfEarth/1.6f;

		//calling volume function for calculation of volume
		double volumeOfSphereInKilos=volume(radiusOfEarth);

		//calling volume function for calculation of volume
		double volumeOfSphereInMiles=volume(radiusOfEarthInMiles);
		System.out.println("The volume of earth in cubic kilometers is "+volumeOfSphereInKilos+" and cubic miles is "+volumeOfSphereInMiles);
	}
		
	