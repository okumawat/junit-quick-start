package com.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    private String message;

    public App(String msg){
    	this.message=msg;
    }

    public String printMessage(){
    	System.out.println("Message:"+this.message);
	return message;
    }

    public static void main( String[] args )
    {
	App app = new App("Python is a oop programming language.");
	app.printMessage();
        System.out.println( "Hello World!" );
    }
}
