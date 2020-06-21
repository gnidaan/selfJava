package com.demo.hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehicle implements Serializable
{
	String name;
	int id;
	public Vehicle(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}

public class Objectstreamm {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Vehicle v=new Vehicle("audihbjensdckus",238234);
		File ff=new File("vehicle.bin");
		new Objectstreamm().srin(ff, v);
		new Objectstreamm().deser(ff);

	}
	
	public void srin(File f,Vehicle v) throws IOException {
		FileOutputStream fi=new FileOutputStream(f);
		ObjectOutputStream oo=new ObjectOutputStream(fi);
		oo.writeObject(v);
		oo.flush();
		oo.close();	
	}
	
	private void deser(File ff) throws IOException, ClassNotFoundException {
		FileInputStream ffo=new FileInputStream(ff);
		ObjectInputStream oo=new ObjectInputStream(ffo);
		Vehicle v=(Vehicle)oo.readObject();
		System.out.println("the name of vehicle="+v.name);
		System.out.println("the name of vehicle="+v.id);
	}

}
