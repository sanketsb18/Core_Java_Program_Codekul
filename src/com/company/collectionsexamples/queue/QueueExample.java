package com.company.collectionsexamples.queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> carsQueue = new PriorityQueue<>();

        carsQueue.add("Mercedez");
        carsQueue.add("Lamborghini");
        carsQueue.add("Porsche");
        carsQueue.add("Bentley");
        carsQueue.add("Toyota");
        carsQueue.add("BMW");
        carsQueue.add("Rolls Royce");


        System.out.println("Cars queue list : " +carsQueue);

        carsQueue.peek();

        System.out.println("Cars list : " +carsQueue);

        carsQueue.poll();

        System.out.println("List : " +carsQueue);

        Iterator <String> stringIterator = carsQueue.iterator();
        while (stringIterator.hasNext()) {
            System.out.println("Cars name : " +stringIterator.next());
        }

        Deque <String> stringDeque = new ArrayDeque<>();
        stringDeque.add("Codekul");
        stringDeque.add("Java");
        stringDeque.add("Python");
        stringDeque.add("Dot Net");

        for (String str : stringDeque) {
            System.out.println("Deque list : " +str);
        }

        stringDeque.addAll(carsQueue);

        System.out.println("List after merging Cars queue list " +
                "and string dequeue list : " +stringDeque);
    }
}
