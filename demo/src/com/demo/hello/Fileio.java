package com.demo.hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fileio {

	public static void main(String[] args) {
		
		File fname=new File("nid.txt");
		Fileio f=new Fileio();
	//	f.write_Intofile(fname);
		f.read_file(fname);
	}
	
	public void write_Intofile(File fname) {
		PrintWriter pr=null;
		try {
			 pr=new PrintWriter(fname);
			 pr.write("nidaan");
			 pr.write("120");
		} catch (FileNotFoundException e) {
			System.out.println("Enable to open file"+fname.getName());
			throw new RuntimeException(e);
		}
		finally {
			pr.close();
		}
	}
	
	public void read_file(File f) {
		try {
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{
				System.out.println("the line is"+sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
