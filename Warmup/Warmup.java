
/**
 * Write a description of class Warmup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Warmup
{
    public static void main(){
        String s1 = "e";
        String s2 = "This week is homecoming WEEk";

        System.out.print(strOcurs(s1,s2));
    }

    public static int strOcurs(String a, String b){
        int x =0; 
        int y=0;
        a = a.toLowerCase();
        b= b.toLowerCase();
        while ( true){
            if (b.indexOf(a) != -1){
                x=x+1;
                b = b.substring(b.indexOf(a)+1);
                //System.out.println(b);

            }else {
                return x; 
            }

        }
    }
}
