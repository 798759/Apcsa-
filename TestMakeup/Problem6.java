
/**
 * Write a description of class Problem6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Problem6
{
    public static void main(){
        int nums[];
        nums= new int[4];
        int x= 0;
        int w =0;
        boolean cool = true; 
        while (cool){
            nums[x] = (int)(Math.random()*6)+2;
            x++;
            if (x>=4){
                cool=false;
            }
            System.out.println(Arrays.toString(nums));
    }
}
}
