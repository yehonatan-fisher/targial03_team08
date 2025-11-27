/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encryption
{
    //Rearrange the sentence
    //matan
    public static String newPassword(String password,int wordCount){
        if (wordCount == 1){
        }
        else if (wordCount == 2){
            String[] parts = password.split(" ");
            String word1 = parts[0];
            String word2 = parts[1];
            password = word2 +" "+ word1;
        }
        else{
            String[] parts = password.split(" ");
            String word1 = parts[0];
            String word2 = parts[1];
            String word3 = parts[2];
            password = word3 +" "+ word1 +" "+ word2;
        }
        return password;
    }
    
    //Find how many words are in a sentence and what they are
    //matan
    public static int wordsNum(String password){
        String[] parts = password.split(" ");
        int wordCount = parts.length;
        return wordCount;
    }
    
    // muli
    public static String replace(String input)// replace from words to signs
    {    
        String str = input;
        str = str.replace('o','0' );
        str = str.replace('a','@' );
        str = str.replace('e','#' );
        str = str.replace('i','1' );
        str = str.replace('u','&' );
        return str;
    }
    
   // muli
    public static String restore (String sentence){ // replace from signs to words
        String str = sentence;
        str = str.replace('0','o' );
        str = str.replace('@','a' );
        str = str.replace('#','e' );
        str = str.replace('1','i' );
        str = str.replace('&','u' );
        return str;
    }
    
    public static void main(String[] args){
        
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        
    }
    }
}
