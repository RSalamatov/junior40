package lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionLesson11 implements CollectionUtils {


    @Override
    public java.util.Collection<Integer> union(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        for (Integer element : b) {
            a.add(element);
        }
        return a;
//        a.addAll(b);
//        return a;
    }

    @Override
    public java.util.Collection<Integer> intersection(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer elementA : a) {
            for (Integer elementB : b) {
                if (elementA == elementB) {
                    intersection.add(elementA);
                }
            }
        }
        return intersection;
//        a.retainAll(b);
//        return a;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> unionWithoutDuplicate = new HashSet<>();
        for (Integer element : a) {
            unionWithoutDuplicate.add(element);
        }
        for (Integer element : b) {
            unionWithoutDuplicate.add(element);
        }
        return unionWithoutDuplicate;

//        HashSet<Integer> unionWithoutDuplicate = new HashSet<>();
//        unionWithoutDuplicate.addAll(a);
//        unionWithoutDuplicate.addAll(b);
//        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
        for (Integer elementA : a) {
            for (Integer elementB : b) {
                if (elementA == elementB) {
                    intersectionWithoutDuplicate.add(elementA);
                }
            }
        }

        return intersectionWithoutDuplicate;

//        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
//        intersectionWithoutDuplicate.addAll(a);
//        intersectionWithoutDuplicate.retainAll(b);
//        return intersectionWithoutDuplicate;
    }

    @Override
    public java.util.Collection<Integer> difference(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> difference = new ArrayList<>();
        for (Integer elementB : b) {
            for (Integer elementA : a) {
                if (elementB == elementA) {
                    a.remove(elementA);
                    break;
                }

            }
        }
        return a;
//        a.removeAll(b);
//        return a;
    }
}
