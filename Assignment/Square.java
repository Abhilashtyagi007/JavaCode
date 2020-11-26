package Assignment;

public class Square {
	int length;
	
	public Square(int x){
		length = x;
	}
	
	double area(){
		return length*length;
	}
	
	double enlarge(int x) {
		if(x>length)
			length = x;
		return length;
	}
	
	void print(){
		System.out.println(length);
	}
	
	void pattern() {
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				if(i==0||j==0||i==length-1||j==length-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
