package ctrl;

import java.util.Scanner;

public class stdin {
    public static void main(String[] args) {
        double sum=0;
        double count = 0;
        double num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("程序开始接收数据 : ");
        while(scanner.hasNextDouble()) {
            num = scanner.nextDouble();
            sum+=num;
            count++;
            System.out.println("开始输入第"+count+"个数据");
        }
        System.out.println("平均:："+sum/count);

        scanner.close();
    }
}
