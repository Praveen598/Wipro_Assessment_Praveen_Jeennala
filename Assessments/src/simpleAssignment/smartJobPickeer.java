package simpleAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SmartJobPickeer {
    public static void main(String[] args) {
        List<String> jobs = Arrays.asList(
            "Software Engineer",
            "Data Analyst",
            "Web Developer",
            "Cloud Architect",
            "UI/UX Designer",
            "Database Administrator"
        );

        Random random = new Random();
        String pickedJob = jobs.get(random.nextInt(jobs.size()));
        System.out.println("Picked Job: " + pickedJob);
    }
}
