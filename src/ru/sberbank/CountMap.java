package ru.sberbank;

import java.util.Map;

public interface CountMap <K>{
    void add (K key);

    int count(K key);

    Map asMap();

    int remove(K key);

    int size();

    void addAll(CountMap source);

    void copyTo(Map map);
}