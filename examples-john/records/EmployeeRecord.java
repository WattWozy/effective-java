//records cannot extend other classes (as records extend Record)
//records can ofc implement interfaces

import java.lang.IllegalArgumentException;

public record EmployeeRecord(String name, int employeeNumber){

    //instance fields are not allowed

    //you can override the auto-generated constructor with your own
    public EmployeeRecord(String name, int employeeNumber){
        if(employeeNumber<0){
            throw new IllegalArgumentException("negative employee number");
        }
        this.name=name;
        this.employeeNumber=employeeNumber;
    }

    /*
    * Cool: COMPACT CONSTRUCTORS
    * public EmployeeRecord {
    *   if(employeeNumber<0){
            throw new IllegalArgumentException("negative employee number");
        }
    * }
    * the compact constructor assigns the fields automagically: no args nor assignments needed
    * */

    //ex instance method
    public String nameInUpppercase(){
        return name.toUpperCase();
    }

    //ex static methods
    public static void printWhatever(){
        System.out.println("Whatever");
    }

};

// creates getters, NO setters (without "get/set" in these methods)
// members in the record are private final
// Overriders, equals, toString and hashCode
// Constructor takes in all the fields in its constructors (aka Canonical)