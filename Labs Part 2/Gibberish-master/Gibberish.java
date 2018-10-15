
/**
 * Write a description of class Gibberish here.
 *
 * @author (Connor Spackman)
 * @version (10/15/18)
 */
public class Gibberish
{
    private String sourceString; 
    
    public  Gibberish(){
        Template template = new Template();
        sourceString=template.getSourceString();

    }

    public String makeGibberish(WordList5000 wordList5000){
        int currentSourceIndex = 0; //creates variables
        int nextBracket = 0;
        int firstIndex = 0;
        int otherSymbols = 0;
        String typeOfSpeech;
        String resultString = new String(); //creates string for answer
        while(currentSourceIndex<sourceString.length()){
             firstIndex =sourceString.indexOf("<",currentSourceIndex);//finds where this symbol is located
            if (firstIndex== -1){//checks if there is a symbol
                resultString+= sourceString.substring(currentSourceIndex);//if not adds to result
                currentSourceIndex = sourceString.length();
            }else{
                
                resultString+=sourceString.substring(currentSourceIndex,firstIndex);
                nextBracket=sourceString.indexOf(">",currentSourceIndex+1);//finds next bracket
                typeOfSpeech=sourceString.substring(firstIndex+1,nextBracket);//gets whats in between bracket
                if(wordList5000.getRandomWordString(typeOfSpeech)!=null){
                    resultString+=wordList5000.getRandomWordString(typeOfSpeech);//returns new word
                }
                otherSymbols = sourceString.indexOf("</>",nextBracket);//finds close brackets
                
                
                currentSourceIndex = otherSymbols+3; //starts searching after brackets
            }
            
             

        }
 
        return resultString; // returns answer
    }
}
