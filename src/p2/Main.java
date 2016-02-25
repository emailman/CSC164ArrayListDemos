package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Created by emailman on 2/23/2016.
 */

public class Main {
    public static void main (String[] args) {
        Integer[] integerArray = {5, 7, 8, 0, 100};

        // Change the array to an array list
        ArrayList<Integer> integerList =
                new ArrayList<>(Arrays.asList(integerArray));

        System.out.println("original list: " + integerList);

        Collections.sort(integerList);
        System.out.println("sorted list: " + integerList);

        Collections.shuffle(integerList);
        System.out.println("shuffled list: " + integerList);

        // Change the array list to an array
        Integer[] intArray = new Integer[integerList.size()];
        integerList.toArray(intArray);

        // Print the values in the array
        System.out.print("elements in the array: ");
        for (Integer each : intArray)
            System.out.print(each + " ");
        System.out.println();
    }
 }
