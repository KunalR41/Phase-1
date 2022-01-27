package Ass3;

public class InnerClass2 {



private String msg="Inner Classes 2";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	InnerClass2  ob=new InnerClass2 ();  
	ob.display();  
	}
}


