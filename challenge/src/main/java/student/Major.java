package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students = new Student[50]; // a major cannot exceed 50 students
    private int studentCount;

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount < 50) {
            students[studentCount++] = s;
        } else {
            System.out.println("Cannot add student: Major is full.");
        }
    }
    // Getters
    int getStudentCount(){return this.studentCount;}
    int getId(){return this.id;}
    String getCode(){return this.code;}
    String getName(){return this.name;}


    // Display all students in the major
    public void displayStudents() {
        for(int i =0; i< studentCount;i++){
            System.out.println(students[i]);
        }
    }
    // finding a student based on the cne
    public Student findStudentByCNE(String cne){
        for(Student student : students){
            if(student.getCne()== cne) {
                return student;
            }
        }
        return null;
    }
    // Remove student base on cne
    public boolean removeStudent(String cne){
        Student student = findStudentByCNE(cne);
        if (student == null){
            return false;
        }
        else{
            //first,find the index of the student whe want to remove
            int index = -1;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getCne().equals(cne)) {
                    index = i;
                    break;
                }
            }
            // Shift the array left from index
            for (int i = index; i < studentCount - 1; i++) {
                students[i] = students[i + 1];
            }
            students[studentCount - 1] = null;
            studentCount--;
            return true;
        }
    }
    // occupancyRate
    double getOcupancyRate(){
        int capacity = students.length;
        return ((double) getStudentCount() /capacity) * 100;

    }
    // get student list as a string using StringBuilder class
    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i].getCne()).append(" ").append(students[i]).append("\n");
        }
        return sb.toString();
    }
}



