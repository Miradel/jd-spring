package service;

import implementation.Mentor;
import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

public class FullTimeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is Created ...");
    }
}
