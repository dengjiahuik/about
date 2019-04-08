//嵌套循环
//四次循环
public class loop {
    public static void main(String[]args) {
        for (int count = 1; count <= 4; count++) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("i=" + i);
            }
            System.out.println("--------------");
        }
    }
}
//外循环次数是m次    内循环次数是n次 那么内存循环的循环次数需要m*n次
