package com.groupC.src;
public class Parser {

    public  Job[] ParseInput(String[] file) {

        // the input file split into lines
        String[] fileLines = file;

        // the initial Job array is created
        Job[] jobs = new Job[Integer.parseInt(fileLines[0])];

        // creating the array of Job's
        // i=2 due to the fact that input file always contains "n line" + "empty line"
        for (int i=2; i < fileLines.length; i++) {
            String[] times = fileLines[i].split("\\s+");
            jobs[i-2] = new Job(Integer.parseInt(times[0]), Integer.parseInt(times[1]), i-2);
        }

        return jobs;
    }

    public  Job[] ParseOutput(String[] file) {

        // the input file split into lines
        String[] fileLines = file;

        // the initial Job array is created
        Job[] jobs = new Job[Integer.parseInt(fileLines[0])];

        // creating the array of Job's
        // i=2 due to the fact that input file always contains "n line" + "empty line"
        for (int i=2; i < fileLines.length; i++) {
            String[] times = fileLines[i].split("\\s+");
            jobs[i-2] = new Job(Integer.parseInt(times[0]), Integer.parseInt(times[1]), i-2);
            jobs[i-2].resource = Integer.parseInt(times[2]);
        }
        return jobs;
    }
}
