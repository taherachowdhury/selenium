package learnAbstraction;

	public class Iphones extends CellPhones {

		//both call(), sendMessage internally comes here from inheritance concept.
		
		@Override
		void sendMessage() {
			System.out.println("Iphone is very popular");
		}
	
	
	
	}
