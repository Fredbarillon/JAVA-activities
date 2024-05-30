import java.util.*;

public class FourSidedDi {
    public static void main(String[] args) {
        Set<Integer> di4 = new HashSet<>();
        di4.add(1);
        di4.add(2);
        di4.add(3);
        di4.add(4);
        System.out.print("The Set before shuffling: ");
        for (int i : di4)
            System.out.print(i + " ");
        System.out.println();

        List<Integer> di = new ArrayList<>(di4);
        Collections.shuffle(di);
        System.out.print("The roll of the di after shuffling: ");

        System.out.print(di.get(0));
    }
}

 