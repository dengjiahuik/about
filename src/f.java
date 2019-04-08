//用户进行会员注册，输入两次密码，如果相同，提示注册成功；
//如果不相同，提示重新输入密码。
import java.util.*;

public class f {
    public static void main(String[] args) {
        String rt;
        Scanner in = new Scanner(System.in); //使用Scanner类定义对象
        System.out.println("请输入您的密码：");
        String a = in.next(); //接收float型数据
        System.out.println("请再输入您的密码：");
        String b = in.next(); //接收float型数据
        if (a.equals(b)){
            System.out.println("SUCCESS");
        }else {
            System.out.println("请输入您的密码：");
            a = in.next(); //接收float型数据
            System.out.println("请再输入您的密码：");
            b = in.next(); //接收float型数据
        }
    }
}
