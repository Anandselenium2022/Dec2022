package week1.day1;

public class Mobile {
	
	String mobileModel = "iPhone";
	int weight = 180;
	boolean isFullCharge = false;
	double cost = 20000.0000;
	
	
	
	public void makeCall() {
		System.out.println("Call connected....");
		String ownerName = "Anand";
		System.out.println(ownerName);
		
	}
	
	private void sendMsg() {
		System.out.println("Message has been sent....");
		String ownerName = "GC";
		System.out.println(ownerName);
		
	}
	

	public static void main(String[] args) {
		Mobile phone = new Mobile();
		phone.makeCall();
		phone.sendMsg();
		System.out.println(phone.mobileModel);
		System.out.println(phone.weight);
		System.out.println(phone.isFullCharge);
		System.out.println(phone.cost);
		

	}

}
