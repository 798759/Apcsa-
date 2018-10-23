
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(){
        String s1 =" Hi Foools, OOO";
        String s2 = "o";
        System.out.print(letter(s1,s2));

    }

    public static int letter(String a, String b){
        int x =0; 
        a = a.toLowerCase();
        b= b.toLowerCase();
        while(true) {
            if (a.indexOf(b)!= -1){
                x= x+1;
                a = a.substring(a.indexOf(b)+1);

            }else { 
            return x;
        }

    }
}
}
