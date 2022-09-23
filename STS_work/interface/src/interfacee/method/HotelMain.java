package interfacee.method;

public class HotelMain {
	
	public Hotel provideFood(int amount) {
		
		Hotel hotel = null;
		if(amount > 500) {
			hotel = new TajHotel();
			
		}
		else if(amount >200 && amount <=500) {
			hotel = new RoadSideHotel();
		}
		return hotel;
	}

	public static void main(String[] args) {

		HotelMain m1 = new HotelMain();
	Hotel h1 =  m1.provideFood(400);
	
	if(h1!=null) {
		
		if(h1 instanceof TajHotel) {
			TajHotel taj = (TajHotel)h1;
			taj.chickenBiryani();
			taj.masalaDosa();
			taj.paneerMasalaDosa();
		}
		else if(h1 instanceof RoadSideHotel) {
			RoadSideHotel road = (RoadSideHotel)h1;
			road.chickenBiryani();
			road.masalaDosa();
			road.DalChawal();
		}
	}
	else {
		System.out.println("Amount should be greater than 200");
	}
		
	}

}
