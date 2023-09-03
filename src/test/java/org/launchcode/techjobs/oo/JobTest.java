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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();

        org.junit.Assert.assertEquals(job.toString().startsWith(System.lineSeparator()), true);
        org.junit.Assert.assertEquals(job.toString().endsWith(System.lineSeparator()), true);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType position = new PositionType("Quality control");
        CoreCompetency competency = new CoreCompetency("Persistence");

        Job job = new Job("Product tester", employer, location,
                position, competency);

        String expectedString = System.lineSeparator() +
                "ID: " + job.getId() +
                "\nName: " + "Product tester" +
                "\nEmployer: " + employer.toString() +
                "\nLocation: " + location.toString() +
                "\nPosition Type: " + position.toString() +
                "\nCore Competency: " + competency.toString() +
                System.lineSeparator();

        org.junit.Assert.assertEquals(job.toString(), expectedString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job();

        Employer employer = new Employer("Lockheed Martin");
        Location location = new Location("");
        PositionType position = new PositionType("Quality control");
        CoreCompetency competency = new CoreCompetency("");
        Job jobWithFewFields = new Job("Web Dev", employer, location, position, competency);

        String expectedString1 = System.lineSeparator() +
                "ID: " + job.getId() +
                "\nName: " + "Data not available" +
                "\nEmployer: " + "Data not available" +
                "\nLocation: " + "Data not available" +
                "\nPosition Type: " + "Data not available" +
                "\nCore Competency: " + "Data not available" +
                System.lineSeparator();

        String expectedString2 = System.lineSeparator() +
                "ID: " + jobWithFewFields.getId() +
                "\nName: " + "Web Dev" +
                "\nEmployer: " + "Lockheed Martin" +
                "\nLocation: " + "Data not available" +
                "\nPosition Type: " + "Quality control" +
                "\nCore Competency: " + "Data not available" +
                System.lineSeparator();

        org.junit.Assert.assertEquals(job.toString(), expectedString1);
        org.junit.Assert.assertEquals(jobWithFewFields.toString(), expectedString2);
    }
}
