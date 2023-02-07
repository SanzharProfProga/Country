public class Country {
    private String countryName;
    private short numberOfProvinces;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public short getNumberOfProvinces() {
        return numberOfProvinces;
    }

    public void setNumberOfProvinces(short numberOfProvinces) {
        this.numberOfProvinces = numberOfProvinces;
    }
    public String getInfo(){
        return  "\nCountry name: " + countryName +
                "\nNumber of provinces: " + numberOfProvinces;
    }
}