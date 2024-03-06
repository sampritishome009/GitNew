package Inheritance;

public class childClassdemo extends parentClassdemo {

	
	
	  
	
	public void engine() {
		System.out.println("new engine of the new generation");
		
	}
	
	public void colour() {
			System.out.println(colour);
		
	}
	  
	public static void main(String[] args) {
	
		childClassdemo cd =new childClassdemo();
		  cd.colour();
	}

}
