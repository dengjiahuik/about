public class forxunhuan {
    public static void main(String[] args)
    /*for循环:

    格式:初始化语句;boolean表达式;循环后操作语句

for{

        循环体语句

    }

    初始化语句:表达式对循环进行初始化 只在循环开始时执行一次.

    boolean表达式 表达式为false时 循环终止

    循环后操作语句 循环每次之后会调用该语句   一般的该语句都是递增或是递减操作*/ {
        //叫500次你好
        for (int abc = 0; abc < 500; abc++) {
            System.out.println("你好" + abc);

        }


        //从1数到100
        for (int numa = 1; numa <= 100; numa++) {
            System.out.println(numa);
        }
        //计算100以内的正整数和
        int s = 0;
        for (int numa = 1; numa <= 100; numa++) {
            s = s + numa;
        }
        System.out.println(s);
    }
}



