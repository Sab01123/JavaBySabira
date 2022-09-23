package interfacee.method;

public class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
System.out.println("ChickenBiryani from TajHotel");		
	}

	@Override
	public void masalaDosa() {
System.out.println("masalaDosa from TajHotel");		
	}
	//sepicific method
	
	public void paneerMasalaDosa() {
		System.out.println("paneer masala dosa from Taj Hotel");
	}

}
