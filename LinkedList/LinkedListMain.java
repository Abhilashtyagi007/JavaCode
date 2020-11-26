package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("agnivesh");
		ls.add("Abhilash");
		ls.add("vishok");
		ls.add("abhash");
		ls.add("Megha");
		ls.add("Anurag");
		ls.display();
		ls.delete();
		System.out.println();
		ls.display();
		
	}

}
