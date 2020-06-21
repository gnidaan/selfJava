package com.demo.hello;


interface bank
{
	void operation();
}

class debit implements bank
{
	@Override
	public void operation() {
		System.out.println("debited from account");
	}
	
}
class credit implements bank
{
	@Override
	public void operation() {
		System.out.println("credited from account");
	}
	
}
public class Intrfc {

	public static void main(String[] args) {
		bank b=new debit();
		b.operation();
		bank a=new credit();
		a.operation();
	}

}
