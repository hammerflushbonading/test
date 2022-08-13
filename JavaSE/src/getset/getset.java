package getset;

public class getset {

    private int age;
    private String name = "465456";
    public void setname(String names){
        name = names;
    }

    public void setage(int ages){
        age = ages;
    }
    public String getname(){
        return this.name;
    }

    public int getage(){
        return this.age;
    }

    public void test(){
        System.out.println(this.name);
    }
}
