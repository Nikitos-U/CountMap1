package ru.sberbank;

public class Main {
    public static void main(String[] args) {
        SomeCountMap<Integer> map = new SomeCountMap<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        System.out.println(map.count(5));
        System.out.println(map.count(6));
        System.out.println(map.count(10));
        SomeCountMap<Integer> mapNew = new SomeCountMap<>();
        mapNew.add(6);
        mapNew.add(10);
        mapNew.add(5);
        mapNew.addAll(map);
        System.out.println(mapNew.count(5));
        System.out.println(mapNew.count(6));
        System.out.println(mapNew.count(10));
    }
}
