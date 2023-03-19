package Assignment1;

public class Test {
    public static void main(String[] args) {

        NameDetails nameDetails = new NameDetails("Mr" , "Mohamed Shihar","Halaldeen");
        System.out.println(nameDetails.getSalutation());
        System.out.println(nameDetails.getFirstName());
        System.out.println(nameDetails.getLastName());
        nameDetails.displayNameDetails();
        System.out.println(nameDetails.getFullName());
        System.out.println(nameDetails.getInitials());
        System.out.println(nameDetails.getNameWithInitials());

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setMobileNumber("0784777263");
        contactDetails.setCountryCode("0094");
        System.out.println(contactDetails.getInternationalMobileNumber());
        System.out.println(contactDetails.getServiceProvider());
    }
}
