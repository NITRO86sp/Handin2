package com.groupC.test;

import com.groupC.src.FileReader;
import com.groupC.src.Job;
import com.groupC.src.Output;
import com.groupC.src.Parser;

import java.io.File;
import java.io.IOException;

/**
 * Created by radush on 9/7/15.
 */
public class CaseCreator {
    private final String filesPrefix = "ip-";
    private final String inputSufix = ".in";
    private final String outputSufix = ".out";

    private Parser parser;
    private FileReader fileReader;
    private String lastInputFileName;


    public CaseCreator(Parser parser) {
        this.parser = parser;
        this.fileReader = new FileReader();
    }

    public Job[] ReadInput(String inputFileName) throws IOException {
        lastInputFileName = inputFileName;
        File folder = new File("./resources/ip-1.in");
        return parser.ParseInput(fileReader.ReadFile(String.format("./resources/%s%s%s", filesPrefix, inputFileName, inputSufix)));
    }

    public Output ReadOutput() throws IOException {
        return parser.ParseOutput(fileReader.ReadFile(String.format("./resources/%s%s%s", filesPrefix, lastInputFileName, outputSufix)));
    }

}
