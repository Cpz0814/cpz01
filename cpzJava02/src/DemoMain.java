import java.util.Random;

public class DemoMain {
    public static void main(String[] args) {
        zi zi=new zi();
        zi.eat();
        Random random=new Random();
        int i = random.nextInt(12)+1;
        System.out.println(i);
    }
}
