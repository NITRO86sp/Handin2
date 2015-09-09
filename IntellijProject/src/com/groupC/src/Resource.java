package com.groupC.src;

/**
 * Created by Group C on 09-09-2015.
 */
public class Resource {

    private int start;
    private int end;
    private int id;

    public Resource(int s, int e, int i) {
        this.start = s;
        this.end = e;
        this.id = i;

    }

    public int getStart() {
        return start;
    }

    public int getId() {
        return id;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int s) {
        start = s;
    }

    public void setEnd(int e) {
        end = e;
    }

    public void setId(int i) {
        id = i;
    }

}
