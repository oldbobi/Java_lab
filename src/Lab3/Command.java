package Lab3;

public class Command {
    private String surname;
    private String rota;
    private String zvanie;
    private String birthDate;
    private String startServiceDate;
    private String chast;

    public Command() {
    }

    public Command(String surname, String rota, String zvanie,
                   String birthDate, String startServiceDate, String chast) {
        this.surname = surname;
        this.rota = rota;
        this.zvanie = zvanie;
        this.birthDate = birthDate;
        this.startServiceDate = startServiceDate;
        this.chast = chast;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getZvanie() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getStartServiceDate() {
        return startServiceDate;
    }

    public void setStartServiceDate(String startServiceDate) {
        this.startServiceDate = startServiceDate;
    }

    public String getChast() {
        return chast;
    }

    public void setChast(String chast) {
        this.chast = chast;
    }

    public String toString() {
        return surname + ", рота: " + rota + ", звание: " + zvanie +
                ", др: " + birthDate + ", служба с: " + startServiceDate +
                ", часть: " + chast;
    }
}
