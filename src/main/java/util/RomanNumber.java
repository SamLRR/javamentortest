package main.java.util;

import main.java.exception.IllegalNumberException;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanNumber {
    public static Map<String, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put("I", 1);
        romanMap.put("II", 2);
        romanMap.put("III", 3);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("VI", 6);
        romanMap.put("VII", 7);
        romanMap.put("VIII", 8);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XX", 20);
        romanMap.put("XXX", 30);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("LX", 60);
        romanMap.put("LXX", 70);
        romanMap.put("LXXX", 80);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
    }

    public static int getNumber(String key) {
        if (!romanMap.containsKey(key)) {
            try {
                throw new IllegalNumberException();
            } catch (IllegalNumberException e) {
                e.printStackTrace();
            }
        }
        Integer value = romanMap.get(key);
        return value;
    }

    public static String getString(int value) {
        String key = romanMap.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet())
                .toString();
        return key;

    }
}
