package VowelCount;

public class main {
    public static void main(String[] args) {
        String str = "Mama isdhflkxa";
                int count = 0;
                for (char x : str.toCharArray()){
                 if(x == 'a' || x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                     count += 1;
                 }
                }
        System.out.println(count);
    }
}
