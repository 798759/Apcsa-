
/**
 * Write a description of class ReviewProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class ReviewProblems

{
    public static void OneTwo(){
        int i=0; 
        int y= 1;
        int x=0;
        int nums[]; 
        nums = new int[10];
        for(x=0; x<nums.length; x++){// load array loding same number?
            nums[x] = (int) (Math.random()*10) ;
        }
        
        for (i=0; i<nums.length; i++){ //traverse array????
            System.out.println (nums[i]);
        }
    }

    public static void three(){
        int sum =0;
        int nums[];
        int x=0;
        int i=0;
        nums = new int[10];
        for(x=0; x<nums.length; x++){// create array
            nums[x] = (int) (Math.random()*10+1) ;
        }
        for(i=0; i<nums.length; i++){ // add numbers
            sum = sum + nums[i];
        
        }
        System.out.println("sum="+sum);
    }
    public static void four(){
        int w =0;
        int nums[];
        int x=0;
        int i=0;
        int Nnums[];
        Nnums = new int [10];
        nums = new int[10];
        for(x=0; x<nums.length; x++){// create array
            nums[x] = (int) (Math.random()*10+1) ;
        }
        for(w=0; w<10; w++) {
            Nnums[w] = nums[w];
            x++;
        }
        System.out.println(Arrays.toString(nums)); 
        System.out.println(Arrays.toString(Nnums));// error array not creating?
    }
    }
    


