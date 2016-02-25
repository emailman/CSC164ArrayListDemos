package p3;

import java.util.ArrayList;

/*
 * Created by emailman on 2/23/2016.
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Balloon> list = new ArrayList<>();

        list.add(new Balloon("yellow", 10));
        list.add(new Balloon("red", 12));

        System.out.println("number of balloons = " + list.size());
        list.forEach(System.out::println);

        String searchColor = "yellow";
        int searchDiameter = 12;

        boolean found1 = new Balloon(searchColor, searchDiameter).isContainedIn(list);
        System.out.printf("%d inch %s balloon %s%n",
                searchDiameter, searchColor, found1 ? "was found" : "was not found");

        boolean found2 = isFound(searchColor, searchDiameter, list);
        System.out.printf("%d inch %s balloon %s%n",
                searchDiameter, searchColor, found2 ? "was found" : "was not found");
    }

    public static boolean isFound (String c, int d, ArrayList<Balloon> l) {
        for (Balloon each : l) {
            if (each.color.equals(c) && each.diameter == d)
                return true;
        }
        return false;
    }
}

class Balloon {
    String color;
    int diameter;

    Balloon(String c, int d) {
        color = c;
        diameter = d;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean isContainedIn(ArrayList<Balloon> l) {
        for (Balloon each: l) {
            if (this.color.equals(each.color) && this.diameter == each.diameter)
                return true;
        }
        return false;
    }
}


