
/**
 * Write a description of class Problem7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Problem7
{
    public  static void average(){
         int x=0;
         int[] nums = {1,3,4,5,6,5,5,5,4,2};
         int length = 0;
         
           int w=0;
         for(int i=0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10 +1) ;
        }
        
        

        for(int i=0; i<nums.length; i++){
             w= w+nums[i];
             
            }
        w = w/10;
            System.out.println(w);
            
        
        
    }
    
}