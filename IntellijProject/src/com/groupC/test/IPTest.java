package com.groupC.test;

import com.groupC.src.Job;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by radush on 9/7/15.
 */
public class IPTest {

    private String[] fileNames;
    private CaseCreator caseCreator;

    public IPTest(CaseCreator caseCreator) {
        this.caseCreator = caseCreator;
        fileNames = new String[]{
                "1",
                "2",
                "3",
                "rand-1k",
                "rand-1M",
                "rand-10k",
                "rand-100k"
        };
    }

    @Test
    public void testCaseFileCalled1() throws IOException {
        Job[] input = caseCreator.ReadInput(fileNames[0]);
    }

    @Before
    public void setUp() throws Exception {
        long start = System.nanoTime();

        long elapsedTime = System.nanoTime() - start;
    }

    @After
    public void tearDown() throws Exception {

    }
}