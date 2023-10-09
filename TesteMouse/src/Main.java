import java.awt.Robot;
import java.util.Random;

public class Main {
	
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        robot.mouseMove(200,300);
        
        for (int i=0; i<200; i++){  
            int mov_x = ((100 * i)/100) + (300*(100-i)/100);
            int mov_y = ((100 * i)/100) + (300*(100-i)/100);
            robot.mouseMove(mov_x,mov_y);
            robot.delay(10);
        }
    }
}