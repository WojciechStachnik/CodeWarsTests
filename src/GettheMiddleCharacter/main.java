package GettheMiddleCharacter;

public class main {
    public static void main(String[] args) {
        String word = "test";
        if (word.length() % 2 == 0){
            System.out.println(word.substring(word.length()%2-1,word.length()%2));
        }else{
            System.out.println(word.substring(word.length()/2-1,word.length()/2));
        }
    }
}
