package com.demo.hello;

class manager
{
	private double sal=1000000;

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
}

class employee extends manager
{
	private int id=12;
	private int empsal=12;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", empsal=" + empsal +", sal=" + getSal() + "]";
	}
	
	
}

public class oops {

	public static void main(String[] args) {
		employee e1=new employee();
		e1.setSal(875878);
		System.out.println(e1.toString());
		manager m=new manager();
		System.out.println(m.getSal());
		m.setSal(1212);
		System.out.println(e1.getSal());
		Name nn=new Name("nidaan", "gaddpawar");
		Emp ee=new Emp(1, nn);
		System.out.println(ee);
		
		
	}

}
