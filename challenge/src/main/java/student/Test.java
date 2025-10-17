package student;

public class Test {
    public static void main(String[] args) {

        //create a couple of majors
        Major csMajor = Student.DEFAULT_MAJOR;
        Major mathMajor = new Major("45", "Mathematics");

        //create some students associated with these majors

        // Students in Math
        Student s1 = new Student("Ghita", "Bellamine", "0666271994", "ghita@gmail.com", "CNE001", mathMajor);
        Student s2 = new Student("Mustapha", "Lamine", "0661487595", "mustapha@gmail.com", "CNE002", mathMajor);

        // Students in Computer Science
        Student s3 = new Student("Samia", "iraki", "0718296548", "samia@mail.com", "CNE003"); // default
        Student s4 = new Student("Aya", "Benjelloun", "0615487596", "aya@mail.com", "CNE004");  // by default
        Student s5 = new Student("Touria", "Bousbaa", "0621485963", "touria@mail.com", "CNE005", csMajor); // explicitly passing CS major


        // displaying the students of each major
        System.out.println("=== Computer Science Students ===");
        System.out.print(csMajor.getStudentListAsString());

        System.out.println("=== Mathematics Students ===");
        System.out.print(mathMajor.getStudentListAsString());

        // Remove a student
        System.out.println("\nRemoving student with CNE 'CNE004'from CS Major ");
        boolean removed = csMajor.removeStudent("CNE004");
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
        //  display updated list
        System.out.println("\n=== Updated Computer Science Students ===");
        System.out.print(csMajor.getStudentListAsString());
        System.out.println("\n=============================================");
        // show occupancy rate
        System.out.println("CS Major Capacity : 50"); //this is because we consider that each major cannot exceed 50 students
        System.out.printf("Current enrollment: %d students \n", csMajor.getStudentCount());
        System.out.printf("CS Major Occupancy Rate: %.2f%%\n", csMajor.getOccupancyRate());
        System.out.println();
        System.out.println("Math Major Capacity : 50"); //this is because we consider that each major cannot exceed 50 students
        System.out.printf("Current enrollment: %d students\n", mathMajor.getStudentCount());
        System.out.printf("Math Major Occupancy Rate: %.2f%%\n", mathMajor.getOccupancyRate());
    }
}

