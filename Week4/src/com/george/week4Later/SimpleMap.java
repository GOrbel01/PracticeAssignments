package com.george.week4Later;

/**
 * Created by Squall on 29/11/2014.
 */
public interface SimpleMap {

    void put(int key, String name);

    String get(int key);

    void remove(int key);

    boolean isEmpty();
}
