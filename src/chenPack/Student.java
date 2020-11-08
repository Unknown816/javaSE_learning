package chenPack;

public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
        count++;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String hello() {
        return "Hello, " + this.name;
    }
}
