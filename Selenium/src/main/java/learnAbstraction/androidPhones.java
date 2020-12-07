package learnAbstraction;

	public class androidPhones extends CellPhones{

		//both call(), sendMessage internally comes here from inheritance concept.
		
		@Override
	void sendMessage() {
		System.out.println("it has Universal Chargers");
	}



}
