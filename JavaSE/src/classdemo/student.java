package classdemo;

public class student {
    String name;
    //构造器
    public  student(){
        System.out.println("无参构造函数执行");
    }

    public student(String argname){
        this.name = argname;
    }

    public void study(){
        System.out.println(this.name + "study");
    }
    public void eat(){
        System.out.println(this.name + "eat");
    }
}
