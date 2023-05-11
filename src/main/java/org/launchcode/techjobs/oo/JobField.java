package org.launchcode.techjobs.oo;

import java.util.Objects;


/*
Have Employer, Location, CoreCompetency, and PositionType inherit ALL common code.
Consider:
What fields do ALL FOUR of the classes have in common? --> id, nextId, value
Which constructors are the same in ALL FOUR classes? --> empty & String value
What getters and setters do ALL of the classes share? --> getId(), getValue(), setValue()
Which custom methods are identical in ALL of the classes? --> toString, equals, hashCode
 */

public abstract class JobField {


//Fields
    private final int id;   //private int
    private static int nextId = 1;
    private String value;


    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


//Getters & Setters
    public int getId() {
        return id;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }


//custom methods: toString, equals, and hashCode
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;  //return getId() ?
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);  //getId() ?
    }

}
