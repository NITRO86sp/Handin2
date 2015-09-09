package com.groupC.test;

import com.groupC.src.IntervalPartitioner;
import com.groupC.src.Job;
import com.groupC.src.Output;
import com.groupC.src.Parser;
import org.junit.*;

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

    public void testCaseFileCalled1() throws IOException {
        Job[] input = caseCreator.ReadInput(fileNames[0]);
        Output expectedOutput = caseCreator.ReadOutput();
        IntervalPartitioner intervalPartitioner = new IntervalPartitioner(input);
        long start = System.nanoTime();
        Output output = intervalPartitioner.Calculate();
        long elapsedTime = System.nanoTime() - start;
        testResultBuilder.Append(new TestResult(fileNames[0],output.getIterations(),testResultComparer.Compare(output,expectedOutput),elapsedTime));

        Assert.assertTrue(output.getResources() == expectedOutput.getResources());
    }

    @Test
    public void allTestInputs() throws IOException {
        for(String name : fileNames)
        {
            Job[] input = caseCreator.ReadInput(name);
            Output expectedOutput = caseCreator.ReadOutput();
            IntervalPartitioner intervalPartitioner = new IntervalPartitioner(input);
            long start = System.nanoTime();
            Output output = intervalPartitioner.Calculate();
            long elapsedTime = System.nanoTime() - start;
            testResultBuilder.Append(new TestResult(name, output.getIterations(), testResultComparer.Compare(output, expectedOutput), elapsedTime));

            if(output.getResources() != expectedOutput.getResources())
                Assert.fail();
        }

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