package lesson11;

import java.util.HashSet;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        // проход по колекции
        // 1 - с помощью for - используется только в коллекциях, ГДЕ ЕСТЬ ИНДЕКСЫ
        // 2 - c помощью for each - можно пройтись по коллекции, НО НЕ ИЗМЕНИТЬ ЕЁ
        // 3 - с помощью итератора - МОЖЕТ ПРОЙТИСЬ И МОДЕРНИЗИРОВАТЬ КОЛЛЕКЦИЮ

        HashSet<String> texts = new HashSet<>();
        texts.add("qqq");
        texts.add("eee");
        texts.add("!!!fff");
        texts.add("vvv");
        texts.add("vffvv");

        for (Iterator<String> iterator = texts.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());

        }
    }
}
