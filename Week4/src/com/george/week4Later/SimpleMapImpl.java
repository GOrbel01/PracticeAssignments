package com.george.week4Later;

import java.util.List;

/**
 * Created by Squall on 29/11/2014.
 */
public class SimpleMapImpl implements SimpleMap {

    private static final int SIZE = 16;
    private MapWrapper[] entry = new MapWrapper[SIZE];

    public SimpleMapImpl()
    {

    }

    public void put(int key, String val)
    {

    }

    public boolean isEmpty()
    {

    }

    public String get(Integer key)
    {
        int hash = key.hashCode() % SIZE;
        MapWrapper wrap = entry[hash];
        while (wrap != null)
        {
            if (wrap.getKey().equals(key))
            {
                return wrap.getValue();
            }
            wrap = wrap.getNext();
        }
        return null;
    }

    public void remove(int key)
    {

    }

}
