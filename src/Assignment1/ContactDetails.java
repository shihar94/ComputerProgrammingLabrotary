package Assignment1;

public class ContactDetails {
    private String homeNumber;
    private String streetName;
    private String townName ;
    private String postalCode ;
    private String districtName;
    private String provinceName;
    private String countryName;
    private String countryCode;
    private String landlineNumber;
    private String mobileNumber;
    private String email;
    private String website;

    public ContactDetails(){
        homeNumber = "";
        streetName = "";
        townName   = "";
        postalCode = "";
        districtName= "";
        provinceName = "";
        countryName = "";
        countryCode = "";
        landlineNumber = "";
        mobileNumber = "";
        email = "";
        website = "";
    }
    public ContactDetails(String homeNumber , String streetName ,String townName,
                          String postalCode , String districtName, String provinceName,
                          String countryName , String countryCode , String landlineNumber,
                          String mobileNumber , String email , String website){
        this.homeNumber = homeNumber;
        this.streetName = streetName;
        this.townName = townName;
        this.postalCode = postalCode;
        this.districtName = districtName;
        this.provinceName = provinceName;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.landlineNumber = landlineNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInternationalMobileNumber(){
        String internationalNumber = countryCode;
        String newMobileNumber = "";
        if(mobileNumber.charAt(0) == '0')
            newMobileNumber = mobileNumber.substring(1,mobileNumber.length());

        return internationalNumber + newMobileNumber;
    }

    public String getServiceProvider(){
        String service = mobileNumber.substring(0,3);
        String provider = "";
        if(service.equals("070") || service.equals("071")){
            provider = "Mobitel";
        }else if(service.equals("072") || service.equals("073")){
            provider = "Etisalat";
        }else if(service.equals("074") || service.equals("075")){
            provider = "Airtel";
        }else if(service.equals("076") || service.equals("077")){
            provider = "Dialog";
        }else if(service.equals("078") || service.equals("079")){
            provider = "Hutch";
        }

        return provider;
    }
}

