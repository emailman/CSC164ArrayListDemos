package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Delaware");
        list.add("Alaska");
        list.add("New York");

        list.remove("Alaska");

        System.out.println(list.contains("Alaska") ? "Alaska is on the list" : "Alaska is not on the list");

        System.out.println("Least value = " + Collections.min(list));
        System.out.println("Greatest value = " + Collections.max(list));

        Collections.sort(list);

        System.out.println(list);
        System.out.println("Number of elements on the list = " + list.size());
    }
}
