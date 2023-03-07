package Attempt2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class noTimerAttempt {



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


        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j=1; j < list.size(); j++){
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }

        }
        //sortInDescendingOrder();

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("This is in reversed Order" + "" + list);

    }


}
