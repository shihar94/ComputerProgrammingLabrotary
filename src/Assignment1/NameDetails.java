package Assignment1;

public class NameDetails {
    private String salutation;
    private String firstName;
    private String lastName;

    public NameDetails(){
        salutation = "";
        firstName  = "";
        lastName   = "";
    }
    public NameDetails(String salutation){
        this.salutation = salutation;
    }
    public NameDetails(String salutation , String firstName){
        this(salutation);
        this.firstName = firstName;
    }
    public NameDetails(String salutation,String firstName, String lastName){
        this(salutation,firstName);
        this.lastName = lastName;
    }
    public void setSalutation(String salutation){
        this.salutation = salutation;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getSalutation(){
        return salutation;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void displayNameDetails(){
        String nameDetails = firstName + " " + lastName;
        System.out.println(nameDetails);
    }
    public String getFullName(){
        String nameDetails = salutation + ". "+ firstName + " " + lastName;
        return nameDetails;
    }
    public String getInitials(){
        String initials = "";
        char prev = ' ';
        for(int i = 0 ; i < firstName.length() ; i++)
        {
            if(prev == ' ' || i == 0)
            {
                initials = initials + firstName.charAt(i) +".";
            }
            prev = firstName.charAt(i);
        }

        return initials;
    }
    public String getNameWithInitials(){
        String nameWithInitials = salutation + ". " + getInitials() + " " + lastName;
        return nameWithInitials;
    }

}
