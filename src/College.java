import java.time.LocalDate;

public class College extends  EducationCenter{

    public College(String name, String locatCountry, LocalDate foundationyear) {
        super(name, locatCountry, foundationyear);
    }

    @Override
    public String toString() {
        return "College{} " + super.toString();
    }
}
