package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id; //private static int id = 0;
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

    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

//    public static int getId() {
//        return id;
//    }

    public int getId() {
        return id;
    }

//    public static boolean getId() {
//        return id;
//    }

    /*
    How toString method needs to behave:
    - When passed a Job object, it should return a string that contains a blank line
        before & after the job information
    - The string should contain a label for each field, followed by the data stored in that field.
        Each field should be on its own line.
    - If a field is empty, the method should add, “Data not available” after the label
    - (Bonus) If a Job object ONLY contains data for the id field, the method should return,
        “OOPS! This job does not seem to exist.”
    ID:  _______
    Name: _______
    Employer: _______
    Location: _______
    Position Type: _______
    Core Competency: _______
 */
/*
the test only checks if the returned string starts and ends with a blank line, make that happen
 */

//    public String toString() {
//        String Job = "\n";
//        return String.valueOf('\n'+ Job +'\n');
//
//    }

/*
the test checks if the string contains a label for each field, followed by the data stored in that
field, and that each field is on its own line
*/

/*
the test checks if a field is empty, the method should add, "Data not available" after the label
 */

/*
BONUS: the test checks if a Job object ONLY contains data for the id field, the method should return,
"OOPS! This job does not seem to exist."
 */
    @Override
    public String toString() {
//        if (int id == int i = 0) { //default values: int = 0, string = null //BONUS
//            return "OOPS! This job does not seem to exist.";        //BONUS
//        }
        if (this.getName() == null && this.getEmployer() == null && this.getLocation() == null
                && this.getPositionType() == null && this.getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist.";
        } else {
            String response = "\nID: " + id + "\n";

            if (this.getName() == "") {  //|| this.getName() == ""
            response += "Name: Data not available\n";
            } else {
                response += "Name: " + this.getName() + "\n";
            }

            if (employer.getValue() == null || employer.getValue() == "") {  //equals()  // || employer.getValue() == ""
                response += "Employer: Data not available\n";
            } else {
                response += "Employer: " + employer.getValue() + "\n";
            }

            if (location.getValue() == null || location.getValue() == "") {
                response += "Location: Data not available\n";
            } else {
                response += "Location: " + location.getValue() + "\n";
            }

            if (positionType.getValue() == null || positionType.getValue() == "") {
                response += "Position Type: Data not available\n";
            } else {
                response += "Position Type: " + positionType.getValue() + "\n";
            }

            if (coreCompetency.getValue() == null || coreCompetency.getValue() == "") {
                response += "Core Competency: Data not available\n";
            } else {
                response += "Core Competency: " + coreCompetency.getValue() + "\n";
            }
            return response;
        }
//        return "\nID: " + id + "\n" +
//                "Name: " + this.getName() + "\n" +
//                "Employer: " + employer.getValue() + "\n" +
//                "Location: " + location.getValue() + "\n" +
//                "Position Type: " + positionType.getValue() + "\n" +
//                "Core Competency: " + coreCompetency.getValue() + "\n";
    }


//BONUS:
//    public String toString() {
//        if (!(this instanceof Job)) {
//            return "OOPS! This job does not seem to exist.";
//        }
//
//        return '\n' + "ID: "+ id + "\n" +
//                "Name: " + name + "\n" +
//                "Employer: " + employer.getValue() +"\n" +
//                "Location: " + location.getValue() +"\n" +
//                "Position Type: " + positionType.getValue() +"\n" +
//                "Core Competency: " + coreCompetency.getValue()+'\n';
//
//    }




}
