public class Name {

    private String surname;
    private String firstName;
    private String patronymic;

    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String result = "";

        if (surname != null && !surname.isEmpty()) {
            result += surname;
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += firstName;
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += patronymic;
        }

        return result;
    }
}