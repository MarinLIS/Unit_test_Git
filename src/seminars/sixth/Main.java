package seminars.sixth;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NumberList list1 = new NumberList(Arrays.asList(1, 9, 3, 4, 5, 6, 7, 8, 9, 1));
        NumberList list2 = new NumberList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1));

        System.out.println(NumberListComparator.compareAverages(list1, list2));
    }
}