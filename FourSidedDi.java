import java.util.*;

public class FourSidedDi {
   // entry point for the program with this function:
    public static void main(String[] args) {
     // creating an unordered collection to randomise the array
        Set<Integer> di4 = new HashSet<>();
        di4.add(1);
        di4.add(2);
        di4.add(3);
        di4.add(4);
        // checking the existing order
        System.out.print("The Set before shuffling: ");
        for (int i : di4)
            System.out.print(i + " ");
        System.out.println();
        // creating an ArrayList to be able to use Collection.shuffle
        List<Integer> di = new ArrayList<>(di4);
        // randomise the order
        Collections.shuffle(di);
        System.out.print("The roll of the di after shuffling: ");
        // use of get() to GET the first index in the object ArrayList
        System.out.print(di.get(0));
    }
}

 