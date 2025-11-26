package streamApiPrograms;

public interface MyFunInterface {
    void m1();
    void m5();
    default void m2(){
        System.out.println("default method m2");
    }
    default void m3(){
        System.out.println("default method m3");
    }
    static void m4(){
        System.out.println("default method m4");
    }
}
