public enum Days {

    MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби куну жава окуйм"),
    WEDNESDAY("Шаршемби куну жава окуйм"),
    THURSDAY("Бейшемби куну жава окуйм"),
    FRIDAY("Жума куну жава окуйм"),
    SATURDAY("Ишемби куну жава окуйм"),
    SUNDAY("Жекшемби куну жава окуйм");

    private String translation;

    Days(String translation) {
        this.translation = translation;
    }
public String getTranslation(){
        return translation;
}

    @Override
    public String toString() {
        return "Days{" +
                "translation='" + translation + '\'' +
                "} " + super.toString();
    }
}

