public class ClassesAndObject {
    private String name;
    private int age;
    public ClassesAndObject(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        ClassesAndObject obj1 = new ClassesAndObject("shanker joshi",20);
        ClassesAndObject obj2 = new ClassesAndObject("sonu joshi",14);
        System.out.println("Your name is "+obj1.getName() + " and age is "+ obj1.getAge());
        System.out.println("Your name is "+obj2.getName() + " and age is "+ obj2.getAge());
    }
}
