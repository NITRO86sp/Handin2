package com.groupC.src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by radush on 9/7/15.
 */
public class IntervalPartitioner {
    private Job[] input;

    public IntervalPartitioner(Job[] input) {
        this.input = input;

    }

    public Output Calculate() {

        // the original Job[] Array for output
        Job[] output = this.input.clone();
        int iter = 0;

        // creating the sorted Job Array
        Job[] sortedArray = this.input;
        Arrays.sort(sortedArray);

        // CREATING A PRIORITY QUEUE , cuz O(n2) is not good enough !!!
        int d = 0;
        Comparator<Resource> comparator = new ResourceTimeComparator();

        // adding first Job since there's always room
        Queue<Resource> resourceQueue = new PriorityQueue<>(comparator);
        resourceQueue.add(new Resource(sortedArray[0].getStart(), sortedArray[0].getEnd(), d));

        // also updating output
        output[sortedArray[0].getId()].setResource(0);

        // main for loop - looping through all Job's (in the sorted list)
        for (int j=1; j<sortedArray.length; j++) {

            iter++;

            if(resourceQueue.peek().getEnd() <= sortedArray[j].getStart()) {

                // get the correct id
                int newId = resourceQueue.peek().getId();

                // there is room for the job in current resources!
                sortedArray[j].setResource(newId);
                resourceQueue.poll();
                resourceQueue.add(new Resource(sortedArray[j].getStart(), sortedArray[j].getEnd(), newId));

                // updates output
                output[sortedArray[j].getId()].setResource(newId);

            } else {

                d++;
                resourceQueue.add(new Resource(sortedArray[j].getStart(), sortedArray[j].getEnd(), d));
                sortedArray[j].setResource(d);

                // updates output
                output[sortedArray[j].getId()].setResource(d);
            }
        }
        return new Output(output, iter, resourceQueue.size());
    }
}
