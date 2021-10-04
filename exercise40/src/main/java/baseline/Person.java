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
        //get firstName
        return firstName;
    }
    public String getLastName(){
        //get lastname
        return lastName;
    }
    public String getDepartment(){
        //get department
        return department;
    }
    public String getSeparationDate(){
        //get seperationDAte
        return separationDate;
    }
    public String findName(String name){

        //checks to see if the first name contains name
        //checks to see if the last name contains name
        //if either contain print it and return the name
        int number =0;
        if(getFirstName().contains(name)){
            number =1;
        }
        else if (getLastName().contains(name)){
            number =1;
        }
        if(number == 1){
            if(getSeparationDate() == null){
                System.out.printf("%s %s        %s  \n",getFirstName(), getLastName(), getDepartment());
                return getLastName();
            }
            else {
                System.out.printf("%s %s     %s  %s\n",getFirstName(), getLastName(), getDepartment(), getSeparationDate());
                return getLastName();
            }

        }
        else{
            return "";
        }
    }


}
