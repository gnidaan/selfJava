package com.demo.hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class stud
{
	public int id;
	public String name;
	public stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class arraralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> aa=new arraralist().create();
		//new arraralist().print(aa);
		stud s1=new stud(12,"patttwas");
		
		ArrayList aa=new ArrayList();
		aa.add("nidaan");
		aa.add(20);
		aa.add(2.2);
		aa.add(s1);
		
		/*
		 * Object o=aa.get(3);
		 * 
		 * System.out.println(o);
		 */
		Iterator<Object> itr=aa.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public List create()
	{
		List<String> ll=new ArrayList<String>();
 		ll.add("car");
 		ll.add("dssad");
 		ll.add("weqdas");
 		return ll;
	}
	
	public void print(List<String> ll) {
		Iterator lit=ll.iterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
	}

}
