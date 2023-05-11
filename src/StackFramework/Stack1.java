package StackFramework;

import java.util.Stack;
import java.util.Vector;
//Last in first out(FILO or LIFO)

public class Stack1 {
    public static void main(String[] args) {
        Stack<String > cities=new Stack<>();
        cities.push("pune");//3
        cities.push("mumbai");//2
        cities.push("Delhi");//1
        //Print infoo of cities
        System.out.println(cities);
        System.out.println("City:"+ cities.peek());
        cities.push("Banglore");
        System.out.println(cities);
        System.out.println("City:"+ cities.peek());
        //remove top element
        cities.pop();
        System.out.println(cities);
        //search position
        System.out.println("Position : "+cities.search("pune"));
        System.out.println(cities.isEmpty());
        cities.clear();
        System.out.println(cities);
    }
}
