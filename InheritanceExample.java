

public class InheritanceExample {
    public static class A {
        public void methodA(){
            System.out.println("Base Class method");
        }
    }
    public static class B extends A{
        public void methodB(){
            System.out.println("Child class of method 2");
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.methodA();
        obj.methodB();
    }
}
