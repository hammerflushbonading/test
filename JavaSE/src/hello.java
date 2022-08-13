public class hello {
    static int a = 10;  //类变量 从属于类
    int b = 0;  //对象变量
    public static void main(String[] args) {
       // System.out.println(a);
        hello aaa = new hello();
        System.out.println(aaa.b);
    }
}
