package com.groupC.src;

/**
 * Created by radush on 9/7/15.
 */
public class IntervalPartitioner {
    private Job[] input;

    public IntervalPartitioner(Job[] input) {
        this.input = input;
    }

    public Output Calculate(){
        return new Output(new Job[]{new Job(1,2,3),new Job(1,2,3),new Job(1,2,3)},1000);
    };
}
