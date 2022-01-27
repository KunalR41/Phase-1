package M;

 class defAccessModifire {

	
	
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	 class Accessmodifier {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			defAccessModifire obj = new defAccessModifire(); 		  
	        obj.display(); 

		}
	}


