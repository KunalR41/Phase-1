package M;

class priAccessModifer
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

 class accessSpecifiers2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priAccessModifer  obj = new priAccessModifer(); 
        //trying to access private method of another class 
        obj.display();

	}
}




