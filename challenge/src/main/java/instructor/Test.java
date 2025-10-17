package instructor;

public class Test {
    public static void main(String[] args) {
        Instructor i1 = new Instructor(" Fahd", "Kalloubi", "0600000000", "fahd@gmail.com", "001");
        Instructor i2 = new Instructor("Karima", "Moumane", "0705050505", "karima@gmail.com", "002");

        System.out.println("The summary line example :\n" + i1.summaryLine());

        System.out.println("Display the name of the second instructor : "+ i2.displayName());
        System.out.println(i1.toCard());

        Subject s1 = new Subject(" cs-101 ", "introduction to java");
        System.out.println(s1.normalizedCode());
        System.out.println(s1.properTitle());
        System.out.println(s1.syllabusLine(i1));
        System.out.println("Is intro course? " + s1.isIntroCourse());
    }
}
