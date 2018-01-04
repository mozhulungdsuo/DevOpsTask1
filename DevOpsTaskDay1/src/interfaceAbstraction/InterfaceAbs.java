package interfaceAbstraction;

public class InterfaceAbs implements ShowInterface{

		public void print() {
		
		System.out.println("Hello");
	}

	
	public void show() {
		System.out.println("Good morning");
	}
	
		
		public static void main(String []args) {
			InterfaceAbs obj1=new InterfaceAbs();
			obj1.print();
			obj1.show();
			
		}
		
		
	}


