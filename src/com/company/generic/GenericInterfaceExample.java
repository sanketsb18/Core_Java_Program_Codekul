package com.company.generic;

//interface implements Comparable interface
interface MinMax <T extends Comparable <T> > {
    T max ();
}

class MyClass <T extends Comparable <T>> implements MinMax<T> {
    T[] vals;
    MyClass (T[] o) {
        vals = o;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Integer[] inums = {3, 9, 2, 8, 6};
        Character[] alphabets = {'a', 'b', 'z', 'd', 'e', 'f', 'g'};
        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(alphabets);
        System.out.println(a.max());
        System.out.println(b.max());
    }
}
