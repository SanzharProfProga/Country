import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dayOfBirth;
    private String profession;
    private byte age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        LocalDate localDate = LocalDate.of(2023, 2, 7);
        this.age = (byte) Period.between(dayOfBirth, localDate).getYears();

    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public byte getAge() {
        return age;
    }

    public String getInfo() {
        return "\nPerson info" +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age +
                "\nProfession: " + profession;
    }
}
