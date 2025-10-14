package student;

public class Student extends Person {
    private String cne;
    private Major major;
    static final Major DEFAULT_MAJOR = new Major("23", "Computer Science");
    // no args constructor
    public Student() {
        this("", "", "", "", "", DEFAULT_MAJOR);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, DEFAULT_MAJOR);
    }

    // Main constructor
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;

        if (major != null && major.getStudentCount() < 50) {
            this.major = major;
        }
        else {
            this.major = DEFAULT_MAJOR;
        }
        this.major.addStudent(this);
    }

    // Getters
    public String getCne(){return cne;}
    public Major getMajor() {
        return major;
    }
    // Setters
    void setCne(String cne){this.cne = cne;}
    void setMajor(Major major) {
        if (major != null && major.getStudentCount() < 50) {
            this.major = major;
            major.addStudent(this);
        }
        else{
            System.out.println("Cannot assign student to major: Major is full or null.");
        }
    }
    // getFullName formatted
    String getFullNameFormatted(){
        String upperCaseSecondName = getSecondName().toUpperCase();
        return String.format("%s %s",upperCaseSecondName,getFirstName());
    }
    @Override
    public String toString(){
        return getId() + " " + getPhone() + " " + getFullNameFormatted();
    }

}

