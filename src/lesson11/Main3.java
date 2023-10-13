package lesson11;

import java.util.ArrayList;
import java.util.Collection;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(3);

        b.add(2);
        b.add(3);
        b.add(4);

        CollectionLesson11 collectionLesson11 = new CollectionLesson11();
        Collection<Integer> union = collectionLesson11.union(a, b);
        Collection<Integer> intersection = collectionLesson11.intersection(a, b);
        Collection<Integer> unionWithoutDuplicate = collectionLesson11.unionWithoutDuplicate(a, b);
        Collection<Integer> intersectionWithoutDuplicate = collectionLesson11.intersectionWithoutDuplicate(a, b);
        Collection<Integer> difference = collectionLesson11.difference(a, b);
        Collection<Integer> differenceBack = collectionLesson11.difference(b, a);

    }
}
