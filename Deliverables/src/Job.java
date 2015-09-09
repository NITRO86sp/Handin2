package com.groupC.src;

public class Job implements Comparable<Job> {

    private int start = 0;
    private int end = 0;
    private int id = 0;
    private int resource = -1;

    public Job(int s, int e, int i){
        super();
        this.start = s;
        this.end = e;
        this.id = i;
    }

    public Job(int s, int e, int i, int r){
        super();
        this.start = s;
        this.end = e;
        this.id = i;
        this.resource = r;
    }

    public void setResource(int r){
        resource = r;
    }

    public void setId(int i) {
        id = i;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    public int getId() {
        return id;
    }

    public int getResource(){
        return resource;
    }

    @Override
    public int compareTo(Job compareJob) {

        int compareStart = ((Job) compareJob).getStart();

        return this.start - compareStart;
    }
}
