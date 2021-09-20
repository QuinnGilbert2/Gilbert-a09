import java.util.*;

public class Solution09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the length? ");
        int length = in.nextInt();
        System.out.print("What is the width? ");
        int width = in.nextInt();
        final double rate = 350;
        int area = length * width;
        System.out.printf("You will need %d gallons of paint to paint %d square feet\n", (int)Math.ceil(area / rate), area);
    }
}
/*
input length and width
area = length*width
gallons of paint = ceiling(area/rate)
print gallons needed
 */
