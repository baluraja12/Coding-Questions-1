package abstraction1;

public abstract class Shape {
	
	Shape(){
		System.out.println("contructer of abstract class ");
	}
	
	int color;
	
	abstract void drawing();
	
	
	public void name() {
		System.out.println("my name is Balu");
	}

}
