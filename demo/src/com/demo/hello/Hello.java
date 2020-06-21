package com.demo.hello;

class student
{
	static private int id;
	private double mrk;
	static String sch_nam="m.k.e.s";
	
	public student() {
		this(2);
	}
	
 	public student(int id) {

		this(id,34.56);
		
	}
 	public student(int id,double mrk) {

		student.id=id;
		this.mrk=mrk;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		student.id = id;
	}
	public double getMrk() {
		return mrk;
	}
	public void setMrk(double mrk) {
		this.mrk = mrk;
	}

	
	public String toString() {
		return "student [id=" + id + ", mrk=" + mrk + ", name=" + sch_nam + "]";
	}
	
	
	
	
}

public class Hello {
	
		 protected void nonstaticfn()
		 {
			 System.out.println("nonstatic");
		 }
		 
		 final Integer x=10;
		 static public void staticfn()
		 {
			 System.out.println("static");
//			 x=11;
		 }
		 
		 String s1="100";
		 String s2="200";

		 
		 public Integer add(Integer a,Integer b)
		 {
			 return a+b;
		 }
	 	public static void main(String [] args) {
		System.out.println("hello world");
		staticfn();
		Hello h1=new Hello();int e=10,e2=60;
		Integer res=h1.add(e, e2);
		System.out.println(res);
		System.out.println(h1.s1+h1.s2);
		h1.nonstaticfn();
		
		Integer x=3,y=5;//int
		System.out.println( x.max(3, 8));
		switch (x) {
		case 3:System.out.println("march");
			
			break;

		default:
			break;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int i=10;
		while ( i>0) {
			i--;
			System.out.println(i);
			
		}
		do {
			i++;
			System.out.println(i);
		}while (i<9);

		//int []r={3,4,5,7};
//		int []r=new int[5];
		int []r=new int[] {3,4,5,6};
		for (int j : r) {
			System.out.println(j);
		}
		
	 	String nw="nidaan";
	 	nw=nw+'o';
	 	System.out.println(nw);
	 	//System.out.println(s.length());
	 	System.out.println(nw.length());
	 	System.out.println(nw.replace('a', 'h'));
	 	
	 	student s1=new student();
	 	System.out.println(s1.toString());
//	 	student s2=new student(8,23.3);
//	 	System.out.println(s2.toString());

	 	
	
	}
	

}
