public class dowhiledemo {
    public static void main(String[] args) {
               /*do while循环
    格式 :
            do{

        循环体语句
    }
while(Boolean表达式);*/
        //叫五百声你好
        int abc = 0;
        do {
            System.out.println("你好" + abc);
            abc++;
        }
        while (abc < 500);


        //从1数到100
        int num = 1;
        do {
            System.out.println(num);
            num++;
        }
        while (num <= 100);
        //计算100以内的正整数和
        int numa = 1;
        int s = 0;
        do {
            s = numa + s; //s +=numa
            numa++;
        }
        while (numa <= 100);
        System.out.println(s);//do里面是循环体语句 如果将system放在do里面  将打印很多次
    }
}