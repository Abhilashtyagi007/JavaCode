package com.practice;

import java.util.*;

public class MyHash {
	int BUCKET;
	ArrayList<LinkedList<Integer>>table;
	MyHash(int b)
	{
		BUCKET=b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++)
		{
			table.add(new LinkedList<Integer>());
		}
		
	}
		
		public void insert(Integer k)
		{
			int i = k % BUCKET;
			table.get(i).add(k);
		}
		public void delete(Integer k)
		{
			int i=k % BUCKET;
			table.get(i).remove(k);
		}
		boolean search(Integer k)
		{
			int i = k % BUCKET;
			return table.get(i).contains(k);
		}
}
