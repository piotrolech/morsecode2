package morsecode;

/**
 * Created by Piot on 09.01.2017.
 */
public class TextToMorseConverter {
    public static String convert(String text){
        String[] split = text.split("");

        StringBuilder morseString = new StringBuilder();

        for (String element : split){
            String convertedChar = convert(element);
            morseString.append(convertedChar);
            morseString.append(" ");
        }

        return morseString.toString();
    }

    public static String convertChar(String charToConvert){
        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", " " };
        String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", "|" };

        int index = -1;
        for (int i = 0; i < alpha.length; i++) {
            String current = alpha[i];
            if(current.equals(charToConvert.toLowerCase())){
                index = i;
                break;
            }
        }
        if(index != -1) {
            return dottie[index];
        }else {
            return " niewłaściwy znak";
        }
    }
}
