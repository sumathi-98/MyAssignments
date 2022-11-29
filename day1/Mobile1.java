package week1.day1;

public class Mobile1 {
 
	public void makeCall() {
		String mobileModel="Vivo";
		float mobileWeight=5.29f; 
	}
	public void sendSms() {
		boolean isFullycharged=true;
		int Mobilecost=18000;
	}
	public static void main(String[] args) {
		Mobile1 mob=new Mobile1();
		mob.makeCall();
		mob.sendSms();
		System.out.println("This is my mobile");
		
		
	}
	
	
	
	

}
