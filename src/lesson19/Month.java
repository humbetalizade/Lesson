package lesson19;

public enum Month {
    JANUARY("Yanvar"),
    FEBRUARY("Fevral"),
    MARCH("Mart"),
    APRIL("Aprel"),
    MAY("May"),
    JUNE("Iyun"),
    JULY("Iyul"),
    AUGUST("Avqust"),
    SEPTEMBER("Sentyabr"),
    OCTOBER("Oktyabr"),
    NOVEMBER("Noyabr"),
    DECEMBER("Dekabr");
    private String value;

    Month(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
