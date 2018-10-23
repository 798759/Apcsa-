
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
  public static void build() {
    SentenceBuilder s1 = new SentenceBuilder();
    System.out.print(s1.getRandomNoun()+" "+s1.getRandomVerb()+" "+s1.getRandomAdjectivies()+ " "+s1.getRandomDeterminer()+" "+s1.getRandomAdverbs()+" "+s1.getRandomPrepositions()); 
    
    }
}
