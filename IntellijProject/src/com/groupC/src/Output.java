package com.groupC.src;

/**
 * Created by radush on 9/7/15.
 */
public class Output {
    private Job[] results;
    private int iterations;
    private int resources;

    public Job[] getResults() {
        return results;
    }

    public int getIterations() {
        return iterations;
    }


    public Output(Job[] results, int iterations, int resources) {
        this.results = results;
        this.iterations = iterations;
        this.resources = resources;
    }

    public Output(Job[] results) {
        this.results = results;
    }

    public Output() {
    }

    public int getResources() {
        return resources;
    }
}
