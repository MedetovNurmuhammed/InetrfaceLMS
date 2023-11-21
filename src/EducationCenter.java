import java.time.LocalDate;

public  abstract class EducationCenter {
    private String name;
    private  String locatCountry;
   private LocalDate Foundationyear;

    public EducationCenter(String name, String locatCountry, LocalDate foundationyear) {
        this.name = name;
        this.locatCountry = locatCountry;
        Foundationyear = foundationyear;
    }



    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatCountry='" + locatCountry + '\'' +
                ", Foundationyear=" + Foundationyear +
                '}';
    }
}
