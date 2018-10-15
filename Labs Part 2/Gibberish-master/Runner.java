
/**
 * Write a description of class Runner here.
 *
 * @author (Connor Spackman)
 * @version (10/15/18)
 */
public class Runner
{
    public static void run(){
        WordList5000 wordList5000 = new WordList5000();//creates method to use
        Gibberish gibberish = new Gibberish();

        String answer;
        answer = gibberish.makeGibberish(wordList5000);
        System.out.println(answer);//prints answer
    }
}
