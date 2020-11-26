package com.practice;

public class hashing {

	public static void main(String[] args) {
		MyHash mh = new MyHash(7);
		 	mh.insert(10);
		    mh.insert(20);
		    mh.insert(15);
		    mh.insert(7);
		    System.out.println(mh.search(10));
		    mh.delete(15);
		    System.out.println(mh.search(15));

	}

}
