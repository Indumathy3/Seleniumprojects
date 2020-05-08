package week1.day1;

public class Mobile {
	int noofcontacts = 5;
	long phonenumber = 9941754722562l;
	double mobileprice =30000.00;
	boolean isused = false;
	String brand = "lenovo";
    public void makeCall() {
		System.out.println("Making call");
	}
	public void sendMessage()
	{
		System.out.println("Sending messages");

	}
	public void takePicture()
	{
		System.out.println("Taking picture");
	}

	public static void main(String[] args) {

		Mobile mycall =new Mobile();
		mycall.makeCall();
		mycall.sendMessage();
		mycall.takePicture();
		int noofcontactsmobile = mycall.noofcontacts;
		long phonenumbermobile = mycall.phonenumber;
		double mobileprice2 = mycall.mobileprice;
		System.out.println( mycall.isused);
		String brandmobile = mycall.brand;
		System.out.println(noofcontactsmobile);
		System.out.println(phonenumbermobile);
		System.out.println(mobileprice2);
		System.out.println(brandmobile);
}
}
