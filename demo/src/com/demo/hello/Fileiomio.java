package com.demo.hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileiomio {

	public static void main(String[] args) throws IOException {
		
		Fileiomio f=new Fileiomio();
		File t=new File("newnew.txt");
		//f.write_iot(t);
		f.read_iot(t);

	}
	
	public void read_iot(File ff) throws IOException {
		FileInputStream fi=new FileInputStream(ff);
		while(fi.read()!=-1)
		{
			char x=(char) (fi.read());
			System.out.println("single="+x);
		}
		fi.close();
	}
	
	public void write_iot(File fnam) throws IOException {
		FileOutputStream fo=new FileOutputStream(fnam);
		fo.write("davcsasqwwas".getBytes());
		fo.close();
	}

}
