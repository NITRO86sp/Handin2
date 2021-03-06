package com.groupC.test;

/**
 * Created by radush on 9/7/15.
 */
public class TestResult {
    public int Iterations;
    public String errors;
    public String caseName;
    public long TimePassed;

    public TestResult(String fileName, int iterations, String errors, long timePassed) {
        Iterations = iterations;
        this.errors = errors;
        TimePassed = timePassed;
        this.caseName = fileName;
    }

    @Override
    public String toString(){
        return String.format("%s\nIterations:\t%s\nTime:\t%s\nErrors:\t%s\n",caseName,Iterations,TimePassed,errors);
    }
}
