package com.company.serializable;

import com.company.Employees;

import java.io.*;

public class SerializableDemo implements Serializable {
    public static void main(String[] args) {
        Employees e = new Employees();
        e.getDetails();

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOut);
            // outputStream.writeObject(e);
            outputStream.close();
            fileOut.close();
            System.out.println("Serialized data is stored in /tmp/employee.ser");
        } catch (FileNotFoundException i) {
            i.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
