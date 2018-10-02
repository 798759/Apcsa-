
/**
 * Write a description of class Problem8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem8
{
    public void Sum(){
        int nums[];
        nums= new int[10];
        int sum=0;
        int[] intnums={1,3,4,5,6,5,5,5,4,2};
        for(int x =0; x<nums.length; x++){
            sum = sum + nums[x];
        }
        System.out.println(sum);
    }
}
