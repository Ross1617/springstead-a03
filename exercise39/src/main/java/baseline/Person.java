package baseline;

public class Person {
    private String firstName;
    private String lastName;
    private String department;
    private String separationDate;

    Person( String firstName,String lastName, String department){
        //takes the input and initializes all the private variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

    }
    Person( String firstName,String lastName, String department,String separationDate){
        //takes the input and initializes all the private variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.separationDate = separationDate;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDepartment(){
        return department;
    }
    public String getSeparationDate(){
        return separationDate;
    }

}


