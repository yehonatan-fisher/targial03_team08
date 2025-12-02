import java.util.Scanner;

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
    // everyone except eitan
    public static String moveSingsRight(String sentence) {
        if (sentence.length() <= 1) {
            return sentence;
        }

        int len = sentence.length();
        String lastChar = sentence.substring(len - 1);    
        String rest = sentence.substring(0, len - 1);   

        return lastChar + rest;
    }

    //everyone except eitan
    public static String moveSingsLeft(String sentence) {
        if (sentence.length() <= 1) {
            return sentence; 
        }

        String firstChar = sentence.substring(0, 1);    
        String rest = sentence.substring(1);             

        return rest + firstChar;
    }
     //Fisher
    //doing the "if"s so that the code will run right (by order) and checking the inputs
    public static void main(String[] args){
                Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        int choice = reader.nextInt();
        System.out.println("Enter up to 3 words sentence");
        String sentence = reader.nextLine();
        int wordsNum = wordsNum(sentence);
        if (wordsNum > 3){
            System.out.println(sentence + " contains more than 3 words");
            return;
        }
        String finalSentence = newPassword(sentence, wordsNum);
        finalSentence = moveSingsLeft(sentence);
        finalSentence = replace(sentence);
        String firstSentence = oldPassword(sentence, wordsNum);
        firstSentence = moveSingsRight(sentence);
        finalSentence = restore(sentence);
        if (choice == 1)
            System.out.println("The encrypted sentence: " + finalSentence);
        else if (choice == 2)
            System.out.println("The decrypted sentence: " + firstSentence);
        else{
            System.out.println(choice + " is not a valid choice");
            return;
        }

     }
}

