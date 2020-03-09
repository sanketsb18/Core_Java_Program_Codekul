package com.company.collectionsexamples.stack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Sanket");
        stringStack.push("Swapnil");
        stringStack.push("Rahul");
        stringStack.push("Rohini");

        System.out.println("Stack : " +stringStack);
        stringStack.pop();
        System.out.println("Stack after calling pop method : " +stringStack);

        Iterator <String> stringIterator = stringStack.iterator();

        while (stringIterator.hasNext()) {
            System.out.println("Name is : " +stringIterator.next());
        }

    }
}
