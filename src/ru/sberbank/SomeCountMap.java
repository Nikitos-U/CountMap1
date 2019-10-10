package ru.sberbank;

import java.util.HashMap;
import java.util.Map;

public class SomeCountMap<K extends Object> implements CountMap<K> {
    private Map<? super K, Integer> map;

    public SomeCountMap() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(K key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            map.put(key, (map.get(key)) + 1);
        }
    }

    @Override
    public int count(K key) {
        if (map.containsKey(key)) {
            return (map.get(key));
        }
        return (0);
    }

    @Override
    public Map asMap() {
        return (map);
    }

    @Override
    public void copyTo(Map map) {
        map = this.map;
    }

    @Override
    public int remove(K key) {
        int count = map.get(key);
        map.remove(key);
        return (count);
    }

    @Override
    public int size() {
        return (map.size());
    }

    @Override
    public void addAll(CountMap source) {
        for (Object k : source.asMap().keySet()) {
            if (map.containsKey(k)) {
                map.put((K) k, map.get(k) + source.count(k));
            } else {
                map.put((K) k, source.count(k));
            }
        }
    }
}