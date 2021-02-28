package com.Multithread;

public class Test 
{

    public static void main(String[] args) throws InterruptedException
    {
	WelcomeThread oWelcomeThread = new WelcomeThread();
	Thread oThread = new Thread(oWelcomeThread);
	oThread.start();
	for(int i = 0; i < 10; i++)
	{
	    System.out.println("Test Main Thread " + i);
	}
    }
    
    /*if we call run() method the thread start and execute super class thread and
    execute main method thread.
    
    if we call start() method the threads are executed parallely.we will get output as
    mixed*/
}
