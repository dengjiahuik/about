public class breakyuju {
    //从一数到十
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++)
        //输出7 终止循环
        {
            if (i == 7) {
                break;//终止循环
            }
            System.out.println(i);
        }
        //求出100以内前五个三的倍数的数字
        //3  6  9  12  15  18  21....
        System.out.println("ending.....");
        int s=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                s++;
            }
            if(s==5)
            {
                break;//终止当前循环
            }
        }
    }


}



