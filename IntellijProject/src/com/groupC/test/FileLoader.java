package com.groupC.test;

import com.groupC.src.FileReader;
import com.groupC.src.Job;
import com.groupC.src.Parser;

import java.io.IOException;

/**
 * Created by radush on 9/7/15.
 */
public class FileLoader {
    private final String filesPrefix = "ip-";
    private final String inputSufix = ".in";
    private final String outputSufix = ".out";

    private Parser parser;
    private FileReader fileReader;
    private String lastInputFileName;

    public FileLoader(Parser parser, FileReader fileReader, String lastInputFileName) {
        this.parser = parser;
        this.fileReader = fileReader;
        this.lastInputFileName = lastInputFileName;
    }

    public FileLoader(Parser parser) {
        this.parser = parser;
    }

    public Job[] ReadInput(String inputFileName) throws IOException {
        lastInputFileName = inputFileName;
        return parser.ParseInput(fileReader.ReadFile(String.format("%s%s%s", filesPrefix, inputFileName, inputSufix)));
    }

    public Job[] ReadOutput() throws IOException {
        return parser.ParseOutput(fileReader.ReadFile(String.format("%s%s%s", filesPrefix, lastInputFileName, outputSufix)));
    }

}
