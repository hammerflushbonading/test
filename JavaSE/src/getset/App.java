package getset;

public class App {
    public static void main(String[] args) {
        String name;
        int age;
        demo000 getsetdemo = new demo000();
        getsetdemo.setname("XH");
        getsetdemo.setage(20);
        name = getsetdemo.getname();
        age = getsetdemo.getage();
        System.out.println("age : " + name + "\nname : " + age);

        System.out.println("\n+++++++++++++++++++++++++++++++++++++\n");

        getsetdemo.test();
    }
}
