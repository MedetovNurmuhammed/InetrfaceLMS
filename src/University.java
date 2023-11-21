import java.time.LocalDate;

public class University extends  EducationCenter{
    public University(String name, String locatCountry, LocalDate foundationyear) {
        super(name, locatCountry, foundationyear);
    }

    @Override
    public String toString() {
        return "University{} " + super.toString();
    }
}
