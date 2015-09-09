package com.groupC.test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by radush on 9/7/15.
 */
public class TestResultBuilder {

    PrintWriter writer;

    public TestResultBuilder() throws FileNotFoundException, UnsupportedEncodingException {
        writer = new PrintWriter("TestResultsRaport.txt", "UTF-8");
    }

    public void Append(TestResult result) {
        writer.println("/////////////////////////////////////////////");
        writer.println(result.toString());
    }

    public void Build(){
        writer.close();
    }
}
