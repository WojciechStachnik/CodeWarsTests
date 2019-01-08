package DecodeTheMorseCode;


public class main {
    public static void main(String[] args) {
        String morseCode = ".... . -.--   .--- ..- -.. .";
        morseCode = morseCode.getBytes("ISO");
        morseCode = morseCode.replace("   "," space ");
        String[] splited = morseCode.split(" ");
        for (int i = 0; i < splited.length ; i++) {
            System.out.println(splited[i]);
        }

    }
}
