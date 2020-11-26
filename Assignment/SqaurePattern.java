package Assignment;
import java.util.*;

public class SqaurePattern {

	public static void main(String[] args) {
		
		Square sqr[] = new Square[10];
		double sum = 0;
		Random rd = new Random();
		for(int i=0;i<10;i++) {
			sqr[i] = new Square(rd.nextInt(10));
		}
		
		for(int i=0;i<10;i++) {
			sqr[i].print();
			sum = sum + sqr[i].area();
			sqr[i].pattern();
		}
		System.out.println(sum);

	}

}
