package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation,
               PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String nameInfo;
        String employerInfo;
        String locationInfo;
        String positionInfo;
        String competencyInfo;

        if(name == null){
            nameInfo = "Data not available";
        }
        else{
            nameInfo = name;
        }

        if(employer == null){
            employerInfo = "Data not available";
        }
        else{
            employerInfo = employer.toString();
        }

        if(location == null){
            locationInfo = "Data not available";
        }
        else{
            locationInfo = location.toString();
        }

        if(positionType == null){
            positionInfo = "Data not available";
        }
        else {
            positionInfo = positionType.toString();
        }

        if(coreCompetency == null){
            competencyInfo = "Data not available";
        }
        else {
            competencyInfo = coreCompetency.toString();
        }

        return System.lineSeparator() +
                "ID: " + id +
                "\nName: " + nameInfo +
                "\nEmployer: " + employerInfo +
                "\nLocation: " + locationInfo +
                "\nPosition Type: " + positionInfo +
                "\nCore Competency: " + competencyInfo +
                System.lineSeparator();
    }
}
