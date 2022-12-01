package Singleton;

public class SigletonRun {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
