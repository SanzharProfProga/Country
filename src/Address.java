public class Address {
    private String streetName;
    private short numberStreet;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public short getNumberStreet() {
        return numberStreet;
    }

    public void setNumberStreet(short numberStreet) {
        this.numberStreet = numberStreet;
    }
    public String getIfoAddress(){
        return "\nStreet name: " + streetName +
                "\nNumber street: " + numberStreet;
    }
}
