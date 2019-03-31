public class whilexunhuan {
    public static void main(String[] args) {//5次你好
        int cs = 0;
        while (cs < 5) {
            System.out.println("你好" + cs);
            cs++;
        }
        //从1数到100
        {
            int num = 1;
            while (num <= 100) {
                System.out.println(num);
                num++;
            }

        }
        //计算100以内的正整数和
        int numa = 1;//表示第一个加数
        int resualt = 0;//表示前n个加数
        while (numa <= 100) {
            resualt = resualt + numa;
            numa++;
        }
        System.out.println(resualt);
    }
}
