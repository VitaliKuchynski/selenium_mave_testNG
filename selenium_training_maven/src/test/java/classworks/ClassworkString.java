package classworks;

public class ClassworkString {

    public static void main(String[] args) {
        reverseEverything("Hello every body");
        reverseEverythingEasy("Hello every body");
        reverseEverythingShort("Hello every body");

    }

    public static void reverseEverything(String userInput) {
        userInput.toLowerCase();
        int sizeOfUserInput = userInput.length();
        System.out.println(sizeOfUserInput);
        char[] tempCharArray = new char[sizeOfUserInput];
        char[] charArray = new char[sizeOfUserInput];

        // Parses user input string to array of chars
        for (int i = 0; i < sizeOfUserInput; i++) {

            tempCharArray[i] = userInput.charAt(i);
        }
        //Reverse array of chars
        for (int t = 0; t < sizeOfUserInput; t++) {
            charArray[t] = tempCharArray[sizeOfUserInput - 1 - t];
        }

        String reverseEnteredValue = new String(charArray);

        System.out.println(reverseEnteredValue);
    }
        //Revers string using reverse() method
        public static void reverseEverythingEasy(String userInput){
            userInput.toLowerCase();
            String reversResult = new StringBuilder(userInput).reverse().toString();
            System.out.println(reversResult);
    }
    //
    public static void reverseEverythingShort(String userInput){
        String result= "";
       for(int i = userInput.length()-1; i >=0; i--){
           result = result + userInput.charAt(i);
       }
        System.out.println(result);
    }

}
