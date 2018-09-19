
/**
 * lab 820.
 *
 * @author (cspackman)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int snumber;
    private boolean sActive;
    private double sGPA;
    private String sName;
    String nums[];
    int nnums[];
    String  Final[];
    int x=0;
    int h =0;
    /**
     * Large Math problem is caculation of my gpa
     */
    public Student()
    {
        // initialise instance variables
        snumber = 3;
        sActive = true;
        sGPA = (4+4+4+4+4+4+3+4+4+4+4+5+5+4+4+4+4)/18;
        sName = "Connor";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setsnumber(int sn)
    {
        snumber = (sn);
    }
    // put your code here
    public int getsnumber(){
        return snumber;}

    public void setsActive(boolean Status)
    {
        sActive = (Status);

    }

    public boolean getsActive(){
        return sActive;}

    public void set ( double GPA)
    {
        sGPA = (GPA);
    }

    public double getsGPA(){
        return sGPA;}

    public void names(){
        nums = new String[5];
        nums[0] = "Connor";
        nums[1] = "Nick";
        nums [2] = "Danny";
        nums [3] = "Freddy";
        nums [4] = "Trevor";

    }
    public void stunum(){
        nnums = new int[5];
        nnums[0]= 798765;
        nnums[1]= 765935;
        nnums[2]= 567432;
        nnums[3]= 300043;
        nnums[4]= 547645;

    }
    public void StuObjects(){
        x=0;
        Final = new String [5];
        for (h=0; h<5; h++){
            Final[x] = nums[x]+" = "+nnums[x];
            System.out.println(Final[x]);
            x++;
        }
    }
}
