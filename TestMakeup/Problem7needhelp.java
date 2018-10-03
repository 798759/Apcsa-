
/**
 * Write a description of class Problem7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Problem7needhelp
{
    public  static void average(){
         int x=0;
         int nums[];
         int length = 0;
          nums = new int[length];
           int w=0;
         for(int i=0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10 +1) ;
        }
        x=0;
        System.out.println(Arrays.toString(nums));
        

        for(int i=0; i<nums.length; i++){
             w= w+nums[i];
             
            }
        System.out.println(w);
            //return w;
        
        
    }
    
}
