public class Human extends Mammalia {
    private String Nationality;
    public String a;
    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    @Override
    public String getName() {
        return "인간입니다.";
    }

}
