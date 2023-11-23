package Constructor;

public class Super2 {
	
	String carmodel1="Vento";
	int carnumber=1234;
	
	void show() {
		
		System.out.println(carmodel1);
		System.out.println(carnumber);
	}
	public static void main(String[] args) {
		Super2 sp=new Super2();
		sp.show();
	}

}
