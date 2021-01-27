public enum MyEnum {
    MONDAY(0, 2,"월요일"),
    TUESDAY(1, 2,"화요일"),
    WEDNESDAY(2, 2,"수요일"),
    THURSDAY(3, 2,"목요일"),
    FRIDAY(4, 2,"금요일"),
    SATURDAY(5, 2,"토요일"),
    SUNDAY(6, 2,"일요일");

    int index;
    int ordinal;
    String name;

    MyEnum(int index, int oridinal, String name) {
        this.index = index;
        this.ordinal = oridinal;
        this.name = name;
    }
}
