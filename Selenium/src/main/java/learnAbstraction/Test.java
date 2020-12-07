package learnAbstraction;

public class Test {

		public static void main (String [] arges) {
	
			//can not create a object of Abstract Class, but can create a Reference variable of Abstract Class/Superclass

			CellPhones cp; 			//reference variable of SuperClass
			
			cp = new Iphones();
			//cp.call();
			cp.sendMessage();
			
			cp= new androidPhones ();
			//cp.call();
			cp.sendMessage();
			



		}
	}