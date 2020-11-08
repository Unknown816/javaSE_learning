package chenPack;

public class Person {
    protected String name;
    protected String[] names;
    protected int age;
    protected int birth;
    public static int count;

    public static int getCount(){
        return count;
    }

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); //去掉首尾空格
    }
    public void setNames(String... names) {
        this.names = names;
    }

    public String getName() {
        return name;
    }
    public String[] getNames() {
        return names;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    public int getAge() {
        return calcAge();
    }
    private int calcAge() {
        return 2020 - this.birth;
    }

    public String toString(){
        return "Person:name="+name;
    }

    public boolean equals(Object o){
        if(o instanceof Person){
            Person p=(Person)o;
            return this.name.equals(p.name);
        }
        return false;
    }

    public int hashCode(){
        return this.name.hashCode();
    }

    public String hello(){
        return "Hello, "+name;
    }
}
