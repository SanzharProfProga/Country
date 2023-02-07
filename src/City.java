public class City {
    private String nameOfTheCity;
    private int citySquare;
    private int numberOfInhabitants;

    public String getNameOfTheCity() {
        return nameOfTheCity;
    }

    public void setNameOfTheCity(String nameOfTheCity) {
        this.nameOfTheCity = nameOfTheCity;
    }

    public int getCitySquare() {
        return citySquare;
    }

    public void setCitySquare(int citySquare) {
        this.citySquare = citySquare;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public void setNumberOfInhabitants(int numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public String getInfo (){
        return "\nName of city: " + nameOfTheCity +
                "\nCity square: " + citySquare + " km^2" +
                "\nNumber of inhabitants: " + numberOfInhabitants;
    }
}
