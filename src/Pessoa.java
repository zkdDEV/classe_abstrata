package zkd.codes;

public abstract class Pessoa {

    private String personCompleteName;

    private String birthDate;

    private String personAddress;

    private String electoralTitle;

    private String cnh;

    public String getPersonCompleteName() {
        return personCompleteName;
    }

    public void setPersonCompleteName(String personCompleteName) {
        this.personCompleteName = personCompleteName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getElectoralTitle() {
        return electoralTitle;
    }

    public void setElectoralTitle(String electoralTitle) {
        this.electoralTitle = electoralTitle;
    }
}
