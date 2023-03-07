package Attempt2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class noTimerAttempt {

//I want to create a list of numbers with the defined parameters

    public static void main(String[] args) {

        ArrayList list =new ArrayList();
        list.add(2);
        list.add(16);
        list.add(16);
        list.add(45);
        list.add(45);
        list.add(86);
        list.add(19);
        list.add(12);
        list.add(11);
        list.add(98);

    // list has been created then print to console to see the 10 entries
        System.out.println(list);

        //Create a for loop to loop through each index, and for each index found check to see if they equal to another index found in the list

        for (int i = 0; i < list.size(); i++) {
            for (int j=1; j < list.size(); j++){

                if (list.get(i) == list.get(j))

                    //if an instance where i = j is found remove constant j from the list
                    list.remove(j);
            }

        }
        //We now then print the updated list without the duplications
        System.out.println(list);
        //now we need to sort out list into descending order, so call onto the collection method, and instansiate the list to appear in reverse order
        Collections.sort(list, Collections.reverseOrder());
        // print out reverse order onto console
        System.out.println("This is in reversed Order" + "" + list);

    }


}
