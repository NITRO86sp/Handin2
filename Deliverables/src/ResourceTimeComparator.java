package com.groupC.src;

import java.util.Comparator;

/**
 * Created by Group C on 08-09-2015.
 */
public class ResourceTimeComparator implements Comparator<Resource> {

    @Override
    public int compare(Resource o1, Resource o2) {
        return o1.getEnd() - o2.getEnd();
    }
}
