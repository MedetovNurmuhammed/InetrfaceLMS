import java.time.LocalDate;

public class School extends  EducationCenter{
    public School(String name, String locatCountry, LocalDate foundationyear) {
        super(name, locatCountry, foundationyear);
    }

    @Override
    public String toString() {
        return "School{} " + super.toString();
    }
}
