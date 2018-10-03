
/**
 * Write a description of class Problem11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem11
{
     public static void digitsSum(){
         boolean x = true;
         int nums = 8888;// set to what every number you want
         int y =0; 
         int answer=0; 
         while(x){
            
             y = nums%10;//takes off last number
             nums = nums/10;//removes last number that hass been addded
             answer= answer+y;// adds numbers together
             if(nums==0){//breaks loop once digits have been added
                 x = false;
                }
            }
            System.out.println(answer);//prints answer
        }
        
    
}
