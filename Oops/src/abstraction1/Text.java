package abstraction1;

public class Text extends Shape{
	
	Text(){
		System.out.println("contructer of text");
	}

	public static void main(String[] args) {
//       Shape s =new Text();
//       s.drawing();
//       s.name();
       
       
       Text t = new Text();
       
       
	}

	@Override
	void drawing() {
		System.out.println("See my drawing");
		
	}

}
