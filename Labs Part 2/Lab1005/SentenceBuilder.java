
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SentenceBuilder
{
    // instance variables - replace the example below with your own
    String[] Nouns = {"Nick", "Dog", "Puppy", "Kevin", "Yanker"};
    String [] Verbs = {"is", "was", "jumps", "falls", "Dunks"};
    String [] Adjectivies = {"tall", "dumb", "smart" , "Yanks"};
    String [] Determiner = {"the", "my" ,"his","her"," yank"}; 
    String [] Adverbs = {" yankily", "happily", "Quickly" , "never"};
    String [] Prepositions = { "over" , "near" ,"under ","inside of"};
    public String getRandomNoun(){
        int x=(int)((Math.random()) * Nouns.length);
        return Nouns[x]; 
    }

    public String getRandomVerb(){
        int x=(int)((Math.random()) * Verbs.length);
        return Verbs [x]; 
    }
    
    public String getRandomAdjectivies(){
        int x=(int)((Math.random()) * Adjectivies.length);
        return Verbs [x]; 
    }
    public String getRandomDeterminer(){
        int x=(int)((Math.random()) * Adverbs.length);
        return Verbs [x]; 
    }
    public String getRandomAdverbs(){
        int x=(int)((Math.random()) * Verbs.length);
        return Verbs [x]; 
    }
    public String getRandomPrepositions(){
        int x=(int)((Math.random()) * Verbs.length);
        return Verbs [x]; 
    }
}

