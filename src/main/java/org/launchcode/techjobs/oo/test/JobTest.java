package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.launchcode.techjobs.oo.*;



/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        String spec = "verify distinct IDs of the two objects";
//        String expected = "job1.getId";
//        String actual = "job2.getId";
        Assert.assertNotEquals(spec, job1.getId(), job2.getId());
        //Assert.assertNotEquals(spec, expected, actual);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        Assert.assertTrue("verify Job class", job1.getName() instanceof String);
        //changed from job1 instanceof Job
        Assert.assertEquals("verify job value", job1.getName(),
                "Product tester");
        Assert.assertTrue("verify employer is Employer class",
                job1.getEmployer() instanceof Employer);
        Assert.assertEquals("verify employer assigns Employer value", job1.getEmployer().getValue(),
                "ACME");
        Assert.assertTrue("verify location is Location class",
                job1.getLocation() instanceof Location);
        Assert.assertEquals("verify location assigns Location value", job1.getLocation().getValue(),
                "Desert");
        Assert.assertTrue("verify positionType is PositionType class",
                job1.getPositionType() instanceof PositionType);
        Assert.assertEquals("verify positionType assigns PositionType value",
                job1.getPositionType().getValue(), "Quality " + "control");
        Assert.assertTrue("verify coreCompetency is CoreCompetency class",
                job1.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals("verify coreCompetency assigns CoreCompetency value",
                job1.getCoreCompetency().getValue(),
                "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec = "test JobIds";
        int expected = job1.getId();
        int actual = job2.getId();
        Assert.assertNotEquals(spec, expected, actual);
    }

}
