package Ass3;

	//anonymous inner class
	abstract class InnerClass {
		   public abstract void display();
		}

		public class InnerClass3 {

		public static void main(String[] args) {
		InnerClass i = new InnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class 3");
		         }
		      };
		      i.display();
		   }
		

	}

