import java.time.LocalDate;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {

      /*Country, City, Address жана Person деген класс түзүп,
        Алардын поляларын ойлоп табыңыз
        Геттер сеттерлерди маани берүү жана алуу үчүн колдонуу керек
        Ар бир класска 3-4 төн объект түзүп жана аларга маанилерин бериңиз
        Ар бир класстын объектилерин өз-өзүнчө массивке салып, аларды консольго чыгарыңыз*/
        Country country = new Country();
        country.setCountryName("Kyrgyzstan");
        country.setNumberOfProvinces((short) 7);

        Country country1 = new Country();
        country1.setCountryName("Japan");
        country1.setNumberOfProvinces((short) 37);

        Country country2 = new Country();
        country2.setCountryName("USA");
        country2.setNumberOfProvinces((short) 13);

        Country[] countries = {country, country1, country2};

        City city = new City();
        city.setNameOfTheCity("Bishkek");
        city.setCitySquare(169);
        city.setNumberOfInhabitants(1074075);

        City city1 = new City();
        city1.setNameOfTheCity("Tokio");
        city1.setCitySquare(2194);
        city1.setNumberOfInhabitants(14047594);

        City city2 = new City();
        city2.setNameOfTheCity("Washington");
        city2.setCitySquare(177);
        city2.setNumberOfInhabitants(689545);

        City[] cities = {city, city1, city2};


        Address address = new Address();
        address.setStreetName("Vostok 5");
        address.setNumberStreet((short) 119);


        Address address1 = new Address();
        address1.setStreetName("Hanatsubaki-dori st");
        address1.setNumberStreet((short) 615);


        Address address2 = new Address();
        address2.setStreetName("M st Northwest");
        address2.setNumberStreet((short) 1203);

        Address[] addresses = {address,address1,address2};

        Person person = new Person();
        person.setFirstName("Sanzhar");
        person.setLastName("Abdymomunov");
        person.setDayOfBirth(LocalDate.of(2003,10,7));
        person.setProfession("Java Developer");


        Person person1 = new Person();
        person1.setFirstName("Masato");
        person1.setLastName("Kawabata");
        person1.setDayOfBirth(LocalDate.of(1977,10,15));
        person1.setProfession("Professional drifting driver");

        Person person2 = new Person();
        person2.setFirstName("Elon");
        person2.setLastName("Musk");
        person2.setDayOfBirth(LocalDate.of(1971,6,28));
        person2.setProfession("Engineer");

        Person [] people = {person,person1,person2};


        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i].getInfo() + " " + cities[i].getInfo() + " " +  addresses[i].getIfoAddress() + "" +
                    " " + people[i].getInfo());

        }


    }
}