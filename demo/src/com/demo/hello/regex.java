package com.demo.hello;

import java.lang.Character.Subset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		String re="[a-z]+";
		String te="My Name Is Nidaan";
		Pattern cmppatn= Pattern.compile(re);
		Matcher mptn= cmppatn.matcher(te);
		while(mptn.find()) {
			System.out.println(te.subSequence(mptn.start(), mptn.end()));
		}
		
		try {
			System.out.println(24/2);
			throw new Exception("yo");
			
		} catch (ArithmeticException e) {
		
			System.out.println("Arithmatic exception");
		}
		 catch (NullPointerException e) {
				System.out.println("null exception");
			}
		 catch (Exception e) {
				System.out.println("Arithmatic exception"+e);
			}
		finally {
			System.out.println("finally will execute");
		}

	}

}
