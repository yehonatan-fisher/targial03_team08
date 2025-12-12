import java.util.Scanner;
public class Encryption
{
    //Rearrange the sentence
    //Fisher (method 3)
   public static String oldPassword(String password, int wordCount) {
    if (wordCount == 1) {
        return password;
    }
    int space1 = password.indexOf(' ');
    int space2 = password.indexOf(' ', space1 + 1);
    if (wordCount == 2) {
        String word1 = password.substring(0, space1);
        String word2 = password.substring(space1 + 1);
        return word2 + " " + word1;
    }
    String word1 = password.substring(0, space1);
    String word2 = password.substring(space1 + 1, space2);
    String word3 = password.substring(space2 + 1);

    return word2 + " " + word3 + " " + word1;
    }
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
    public static String moveSingsRight(String sentence, int wordCount) {
        int len = sentence.length();
        String afterMovment = "";
        if (wordCount == 1){
            String lastChar = sentence.substring(len - 1);
            String rest1 = sentence.substring(0, len - 1);
            afterMovment =  lastChar + rest1;
        }
        else if (wordCount == 2){
            String lastChars1 = sentence.substring(len - 2);
            String rest2 = sentence.substring(0, len - 2);
            afterMovment =  lastChars1 + rest2;
        }
        else if (wordCount == 3){
            String lastChars2 = sentence.substring(len - 3);
            String rest3 = sentence.substring(0, len - 3);
            afterMovment =  lastChars2 + rest3;
        } 
        return afterMovment;
    }

    //everyone except eitan
    public static String moveSingsLeft(String sentence,int wordCount) {
        int len = sentence.length();
        String afterMovment2 = "";
        if (wordCount == 1){
            String firstChar = sentence.substring(0, 1);
            String rest1 = sentence.substring(1, len);
            afterMovment2 =  rest1 + firstChar;
        }
        else if (wordCount == 2){
            String firstChars1 = sentence.substring(0, 2);
            String rest2 = sentence.substring(2, len);
            afterMovment2 =  rest2 + firstChars1;
        }
        else if (wordCount == 3){
            String firstChars2 = sentence.substring(0, 3);
            String rest3 = sentence.substring(3, len);
            afterMovment2 = rest3 + firstChars2;
        } 
        return afterMovment2;
    }
     //Fisher
    //doing the "if"s so that the code will run right (by order) and checking the inputs
    public static void main(String[] args){
                Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        int choice = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter up to 3 words sentence");
        String sentence = reader.nextLine();
        int wordsNum = wordsNum(sentence);
        if (wordsNum > 3){
            System.out.println(sentence + " contains more than 3 words");
            return;
        }
        String finalSentence = newPassword(sentence, wordsNum);
        finalSentence = moveSingsRight(finalSentence, wordsNum);
        finalSentence = replace(finalSentence);
        String firstSentence = restore(sentence);
        firstSentence = moveSingsLeft(firstSentence, wordsNum);
        firstSentence = oldPassword(firstSentence, wordsNum);
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
