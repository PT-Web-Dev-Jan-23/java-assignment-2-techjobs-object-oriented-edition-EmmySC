package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.Job;
import org.junit.Assert.assertNotEquals;
import org.junit.Assert;


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
        String expected = "job1.getId";
        String actual = "job2.getId";
        Assert.assertNotEquals(spec, expected, actual);
    }




}
