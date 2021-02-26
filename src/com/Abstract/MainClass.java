package com.Abstract;

public class MainClass 
{
	public static void main(String[] args)
	{
		Abstract oAbstract = new Abstract() {
			
			@Override
			void m1() 
			{
				System.out.println("Create Object using Anonymous Inner Class");
			}
		};
		oAbstract.m1();
		System.out.println(oAbstract.i);
		System.out.println(Abstract.strName);
	}
}
