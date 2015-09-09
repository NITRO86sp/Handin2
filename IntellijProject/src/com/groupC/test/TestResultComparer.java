package com.groupC.test;

import com.groupC.src.Output;

/**
 * Created by radush on 9/7/15.
 */
public class TestResultComparer {
    public String Compare(Output input,Output output) {
        if(input.getResources() == output.getResources())
        return "It is correct";

        else
            return "Different amount of classes";
    }
}
