package com.Interface;

public class MainClass 
{
	public static void main(String[] args)
	{
		InterfaceExample oInterfaceExample = new InterfaceExample() {

			@Override
			public void m1() {
				System.out.print("Interface Example");				
			}			
		};
		System.out.println(InterfaceExample.strName);
		System.out.println(oInterfaceExample.i);
	}
}
