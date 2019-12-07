package pl.academy.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("ABC");
        set.add("CDE");

        Iterator i = set.iterator();

        while (i.hasNext()) {
            String kolejnyElement = (String) i.next();
            System.out.println(kolejnyElement);
        }
    }
}
