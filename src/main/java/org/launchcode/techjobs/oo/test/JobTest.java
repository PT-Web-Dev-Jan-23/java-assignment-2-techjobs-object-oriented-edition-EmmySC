package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job jobObject1 = new Job();
        Job jobObject2 = new Job();
        String spec = "verify distinct IDs of the two objects";
        Assert.assertNotEquals(spec, jobObject1.getId(), jobObject2.getId());
        //Assert.assertNotEquals(spec, jobObject1, jobObject2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTest = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        Assert.assertTrue("verify Job class", jobTest.getName() instanceof String);
        //changed from jobTest instanceof Job
        Assert.assertEquals("verify job value", jobTest.getName(),
                "Product tester");
        Assert.assertTrue("verify employer is Employer class",
                jobTest.getEmployer() instanceof Employer);
        Assert.assertEquals("verify employer assigns Employer value", jobTest.getEmployer().getValue(),
                "ACME");
        Assert.assertTrue("verify location is Location class",
                jobTest.getLocation() instanceof Location);
        Assert.assertEquals("verify location assigns Location value", jobTest.getLocation().getValue(),
                "Desert");
        Assert.assertTrue("verify positionType is PositionType class",
                jobTest.getPositionType() instanceof PositionType);
        Assert.assertEquals("verify positionType assigns PositionType value",
                jobTest.getPositionType().getValue(), "Quality " + "control");
        Assert.assertTrue("verify coreCompetency is CoreCompetency class",
                jobTest.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals("verify coreCompetency assigns CoreCompetency value",
                jobTest.getCoreCompetency().getValue(),
                "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job jobTest1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job jobTest2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String spec = "test JobIds";
        int expected = jobTest1.getId();
        int actual = jobTest2.getId();
        Assert.assertNotEquals(spec, expected, actual);
        //asserFalse(jobTest1.equals(jobTest2));
    }

/*
This test should check that the first and last characters of the String are, both, the newline character (\n).
Recall that to get the character at a given position in a String use --> str.charAt(index)
 */
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobTest = new Job(); //name, employer, location, positionType, coreCompetency
        String spec = "should check that the first and last characters of the String are both newline";
//        char expected = '\n';
//        char actual = '\n';
//        Assert.assertEquals(spec, expected, actual);

        char firstChar = jobTest.toString().charAt(0);
        char lastChar = jobTest.toString().charAt(jobTest.toString().length()-1);
        Assert.assertEquals(spec, firstChar, '\n');
        assertEquals(spec, lastChar, '\n');
    }

/*
This test should check if the string contains a label for each field, followed by the data stored in
that field, and that each field is on its own line
 */
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobTest = new Job(); //name, employer, location, positionType, coreCompetency
        //("Name", new Employer(), new Location(), new PositionType(), new CoreCompetency())
        String spec = "should check if the string contains a label for each field, followed by the " +
                "data stored in that field, and that each field is on its own line";
        String expected = jobTest.toString();
//                '\n' + "ID: " + jobTest.getId() + '\n' +
//                "Name: " + jobTest.getName() + '\n' +
//                "Employer: " + jobTest.getEmployer() + '\n' +
//                "Location: " + jobTest.getLocation() + '\n' +
//                "Position Type: " + jobTest.getPositionType() + '\n' +
//                "Core Competency: " + jobTest.getCoreCompetency() + '\n';
        String actual = jobTest.getName();
        Assert.assertEquals(spec, expected, actual);
/*
        String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n", getJobId(job), getJobFieldString(job, "name", true),
                getJobFieldString(job, "employer", true), getJobFieldString(job, "location", true),
                getJobFieldString(job, "positionType", true), getJobFieldString(job, "coreCompetency", true));

        Job job = createJob("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
        String jobString = getJobString(job);
        assertEquals(jobString, job.toString());
 */
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType(""), new CoreCompetency("Persistence"));
        //"Product tester", new Employer("ACME"), new Location("Desert"),new PositionType(""), new CoreCompetency
        // ("Persistence")
        Assert.assertEquals(jobTest.toString(), "OOPS! This job does not seem to exist.");
    }

}
