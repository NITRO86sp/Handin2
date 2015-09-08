package com.groupC.test;

import com.groupC.src.IntervalPartitioner;
import com.groupC.src.Job;
import com.groupC.src.Output;
import com.groupC.src.Parser;
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
    private TestResultBuilder testResultBuilder;
    private TestResultComparer testResultComparer;

    public IPTest() {
        this.caseCreator = new CaseCreator(new Parser());
        this.testResultComparer = new TestResultComparer();
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
        Job[] expectedOutput = caseCreator.ReadOutput();
        IntervalPartitioner intervalPartitioner = new IntervalPartitioner(input);
        long start = System.nanoTime();
        Output output = intervalPartitioner.Calculate();
        long elapsedTime = System.nanoTime() - start;
        testResultBuilder.Append(new TestResult(fileNames[0],output.getIterations(),testResultComparer.Compare(output.getResults(),expectedOutput),elapsedTime));
    }

    @Before
    public void setUp() throws Exception {
        testResultBuilder = new TestResultBuilder();
    }

    @After
    public void tearDown() throws Exception {
        testResultBuilder.Build();
    }
}