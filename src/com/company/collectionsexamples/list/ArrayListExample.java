package com.company.collectionsexamples.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> playersList = new ArrayList<>();

        playersList.add("Sachin Tendulkar");
        playersList.add("Rahul Dravid");
        playersList.add("Mohammad Kaif");
        playersList.add("Zaheer Khan");
        playersList.add("Ricky Ponting");

        System.out.println("Cricket players list : " +playersList);

        playersList.remove(3);

        System.out.println("List fter removing 3rd element : " +playersList);

        Iterator<String> stringIterator = playersList.iterator();
        while(stringIterator.hasNext()) {
            System.out.println("Players List : " +stringIterator.next() );
        }

    }
}
