package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Assert;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job test1 = new Job();
        Job test2 = new Job();
        org.junit.Assert.assertNotEquals(test1.getId(), test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType position = new PositionType("Quality control");
        CoreCompetency competency = new CoreCompetency("Persistence");

        Job job1 = new Job("Product tester", employer, location,
                position, competency);

        org.junit.Assert.assertEquals(job1.getName(), "Product tester");
        org.junit.Assert.assertEquals(job1.getEmployer(), employer);
        org.junit.Assert.assertEquals(job1.getLocation(), location);
        org.junit.Assert.assertEquals(job1.getPositionType(), position);
        org.junit.Assert.assertEquals(job1.getCoreCompetency(), competency);

        org.junit.Assert.assertTrue(job1.getName().equals("Product tester"));
        org.junit.Assert.assertTrue(job1.getEmployer().equals(employer));
        org.junit.Assert.assertTrue(job1.getLocation().equals(location));
        org.junit.Assert.assertTrue(job1.getPositionType().equals(position));
        org.junit.Assert.assertTrue(job1.getCoreCompetency().equals(competency));
    }

    @Test
    public void testJobsForEquality() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType position = new PositionType("Quality control");
        CoreCompetency competency = new CoreCompetency("Persistence");

        Job job1 = new Job("Product tester", employer, location,
                position, competency);

        Job job2 = new Job("Product tester", employer, location,
                position, competency);

        org.junit.Assert.assertFalse(job1.equals(job2));
    }
}
