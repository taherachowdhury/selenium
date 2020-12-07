package seleniumDemo;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj = new Mobile();
		
		obj.camera();
		obj.charger();
		obj.video();
		obj.call();
	}
	
	public void camera() {
		System.out.println("take pictures");
	}
	private void charger() {
		System.out.println("I can cahrge my phone");
	}
	
	void video() {
		System.out.println("we cn do video call");
	}
		protected void call() {
			System.out.println("we can talk");
			
		}
		

}
