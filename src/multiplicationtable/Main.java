package multiplicationtable;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> pairNumbers = new HashSet<>();
        int i = 0;
        while (i < 15) {
            int x = (int) (Math.random() * 8) + 2;
            int y = (int) (Math.random() * 8) + 2;
            String pairNumber = x + "*" + y;
            String reversPairNumber = y + "*" + x;
            if (addPairNumber(pairNumbers, pairNumber, reversPairNumber)) {
                System.out.println(pairNumber);
                i++;
            }
        }
    }

    public static boolean addPairNumber(Set<String> pairNumbers, String number, String reversNumber) {
        if (!pairNumbers.contains(reversNumber) && !pairNumbers.contains(number)) {
            pairNumbers.add(number);
            return true;
        } else {
            return false;
        }
    }
}
