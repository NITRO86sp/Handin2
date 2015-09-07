package com.groupC.test;

/**
 * Created by radush on 9/7/15.
 */
public class TestResult {
    public int Iterations;
    public String errors;
    public long TimePassed;

    public TestResult(int iterations, String errors, long timePassed) {
        Iterations = iterations;
        this.errors = errors;
        TimePassed = timePassed;
    }
}
