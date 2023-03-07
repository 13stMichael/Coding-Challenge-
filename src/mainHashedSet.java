import java.util.Arrays;
import java.util.LinkedHashSet;

public class mainHashedSet {


    //Sets do not allow duplicates and will remove the duplications automatically


    //create method to remove duplicates from array of intgers
    public static void removeDuplicates(int[] a){
        //instantiate the set of numbers
        LinkedHashSet<Integer> listofNumbers = new LinkedHashSet<>();

        //create a for loop to add elements to LinkedHash Set
        for (int i = 0; i < a.length; i++) {
            listofNumbers.add(a[i]);
        }
        //print out
        System.out.println(listofNumbers);
    }

    public static void main(String[] args) {

        //in psvm is where we will run our main method
        // I will instantiate my array list in main: The following numbers will be included
        // 2, 24, 48, 48, 72, 72,84, 56, 18, 29

        // the array has been created and the integers between 1-100 are present withing the array
        int listofNumbers[] = {2,24,48,48,72,72,84,56,18,29};
        //call function
        removeDuplicates(listofNumbers);
        Arrays.sort(Arrays.stream(listofNumbers).toArray());
        System.out.println(listofNumbers);
    }
}

