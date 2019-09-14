package com.gp;

/**
 * Hello world!
 *
 */
class Parent{
    public Parent(){
        this.Test();
    }

    private void Test(){
        System.out.println("Parent Test");
    }
}

class Child extends Parent{
    public Child(){
        this.Test();
    }

    public void Test(){
        System.out.println("Child Test");
    }

}


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Child();
    }
}
