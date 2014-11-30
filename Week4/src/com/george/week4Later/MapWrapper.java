package com.george.week4Later;

/**
 * Created by Squall on 30/11/2014.
 */
public class MapWrapper {
    private final Integer key;
    private String value;
    private MapWrapper next;

    public MapWrapper(Integer key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public Integer getKey()
    {
        return  key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public MapWrapper getNext()
    {
        return next;
    }

    public void setNext(MapWrapper wrap)
    {
        this.next = wrap;
    }


}
