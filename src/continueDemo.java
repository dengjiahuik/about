public class continueDemo {
    public static void main(String[] args)
         {
            for (int i = 1; i <= 10; i++)
            {
                if (i==4)
                {
                    continue;//跳过当前循环,进入下一次循环
                    //当前循环的循环体 不再执行
                }
                System.out.println(i);
            }
            System.out.println("ending....");
            //实例:输出100到200之间不能被3整除的数
             //100到200之间 能整除3的数  都跳过输出
             for(int i=100;i<=200;i++)
             {
                 if(i%3==0)
                 {
                     continue;
                    // System.out.println("------");//无法访问的语句
                 }
                 System.out.println(i);
             }
    }
}
