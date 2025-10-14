package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;
    // Constructor
    public Subject(String code, String title){
        this.id = id;
        this.code = code;
        this.title = title;
    }
    // Getters
    int getId(){return this.id;}
    String getCode(){return this.code;}
    String getTitle(){return this.title;}

    // Setters
    void setId(int id){this.id = id;}
    void setCode(String code){this.code = code;}
    void setTitle(String title){this.title = title;}

    // method that return trimmed and upper-cased code
    public String normalizedCode(){
        if(code == null) return "";
        return code.trim().toUpperCase();
    }
    //
    public String properTitle(){
        String[] titleParts = title.split(" ");
        for(int i = 0; i< titleParts.length;i++){
            titleParts[i] = titleParts[i].substring(0,1).toUpperCase() + titleParts[i].substring(1).toLowerCase();
        }
        return String.join(" ", titleParts);
    }
    //
    public boolean isIntroCourse(){
        if ((properTitle().contains("Intro")) || (normalizedCode().startsWith("INTRO-"))){
            return true;
        }
        return false;
    }
    //
    public String syllabusLine(Instructor inst) {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode()).append(" - ").append(properTitle());
        if (inst != null)
            sb.append(" (Instructor: ").append(inst.getSecondName()).append(" ").append(inst.getFirstName()).append(")");
        return sb.toString();
    }

}
