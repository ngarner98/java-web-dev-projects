public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSubject() {
        return subject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
    private void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }
    private void setLastName(String aLastName) {
        this.lastName = aLastName;
    }
    private void setSubject(String aSubject) {
        this.subject = aSubject;
    }
    private void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}

