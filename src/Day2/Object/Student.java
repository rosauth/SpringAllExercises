package Day2.Object;

public class Student {
    private String name;
    private String level;
    private String subject;
    private int score;

//    public Student(String name, String level, String subject, int score) {
//        this.name = name;
//        this.level = level;
//        this.subject = subject;
//        this.score = score;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
