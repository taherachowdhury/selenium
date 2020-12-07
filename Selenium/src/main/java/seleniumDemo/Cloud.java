package seleniumDemo;

public class Cloud {

	public static void main(String[] args) {

		Cloud obj = new Cloud();
	obj.Storage();
	obj.Backup();
	obj.Safe();
	obj.download();
	
	}

	public void Storage() {
		System.out.println("Store data");
	}
	private void Backup() {
		System.out.println("We can backup data");
	}
	void Safe() {
		System.out.println("Your data is safe");
	}
	protected void download() {
		System.out.println("You can download if needed");
	}
}
