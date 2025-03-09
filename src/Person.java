public class Person {

    private String personName;
    private String personBirthDate;
    private String personBirthCountry;
    private String personWebsite;
    private int personId;

    public Person (String personName, String personBirthDate, String personBirthCountry, String personWebsite, int personId) {
        this.personName = personName;
        this.personBirthDate = personBirthDate;
        this.personBirthCountry = personBirthCountry;
        this.personWebsite = personWebsite;
        this.personId = personId;
    }

    public Person () {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonBirthDate() {
        return personBirthDate;
    }

    public void setPersonBirthDate(String personBirthDate) {
        this.personBirthDate = personBirthDate;
    }

    public String getPersonBirthCountry() {
        return personBirthCountry;
    }

    public void setPersonBirthCountry(String personBirthCountry) {
        this.personBirthCountry = personBirthCountry;
    }

    public String getPersonWebsite() {
        return personWebsite;
    }

    public void setPersonWebsite(String personWebsite) {
        this.personWebsite = personWebsite;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
