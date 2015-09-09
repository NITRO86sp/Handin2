package com.groupC.src;
import java.io.IOException;

public class IP {
    public static void main(String[] args) throws IOException {
         if (args.length > 0) {
            FileReader fileReader = new FileReader();
             // Parsing of fileinput - args[0]
             String[] input = fileReader.ReadFile(args[0]);
             Job[] jobs = new Parser().ParseInput(input);
             Output output = new IntervalPartitioner(jobs).Calculate();

             System.out.println(output.getResources() + "\n");
             for (int j=0; j<output.getResults().length;j++) {

                 System.out.println(output.getResults()[j].getStart() + " " + output.getResults()[j].getEnd() + " " + output.getResults()[j].getResource());
             }

         }
         else {
             System.out.println("The program needs a filepath as input. Terminating \n");
         }
 }


}
