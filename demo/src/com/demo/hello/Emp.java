package com.demo.hello;

public class Emp {
private int id;
private Name n;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Name getN() {
	return n;
}
public void setN(Name n) {
	this.n = n;
}
public Emp(int id, Name n) {
	super();
	this.id = id;
	this.n = n;
}

@Override
public String toString() {
	return "Emp [id=" + id + ", " + n.toString() + "]";
}

	
}
