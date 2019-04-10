//return:结束所在的方法
public class returnDemo {
    public static void main(String[] args) {
        //从一输出到十
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;//跳出循环   终止循环
            }
            System.out.println(i);
        }
        System.out.println("ending......");
        System.out.println("---------");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                return;//结束所在的方法
            }
            System.out.println(i);
        }
        System.out.println("ending......");
        //break会执行循环之后的语句
        //return不会执行循环之后的语句
    }
}
