package com.groupC.test;

import com.groupC.src.Parser;

/**
 * Created by radush on 9/7/15.
 */
public class FileLoader {
    private final String filesPrefix = "ip-";
    private final String  inputSufix = ".in";
    private final String  outputSufix = ".out";

    private Parser parser;


    public FileLoader(Parser parser) {
        this.parser = parser;
    }
}
