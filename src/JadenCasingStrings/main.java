package JadenCasingStrings;

public class main {
    public static void main(String[] args) {
        try {
      String phrase =   "test pierwszy";
      String[] arr = phrase.split(" ");
      StringBuilder changedPhrase = new StringBuilder();

          if (!phrase.isEmpty()) {
              for (int i = 0; i < arr.length; i++) {
                  if (Character.isUpperCase(arr[i].charAt(0)) == false) {
                      changedPhrase.append(arr[i].substring(0,1).toUpperCase() + arr[i].substring(1));
                      changedPhrase.append(" ");
                  }else{
                      changedPhrase.append(arr[i]);
                      changedPhrase.append(" ");
                  }
              }
              System.out.println(changedPhrase.substring(0, changedPhrase.length() -1).toString());
          }else{
              System.out.println("Pusty");

          }
      }catch (NullPointerException e){
          System.out.println("Mamy Nulla");
      }

      }
}
