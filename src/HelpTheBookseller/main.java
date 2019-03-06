package HelpTheBookseller;

public class main {
    public static void main(String[] args) {
        String lstOfArt[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String lstOf1stLetter[] = new String[] {"A", "B"};
        StringBuilder result = new StringBuilder();
        int sum = 0;
        if (!(lstOfArt == null || lstOfArt.length == 0 || lstOfArt == null ||  lstOf1stLetter.length == 0)){
            for (int i = 0; i <lstOf1stLetter.length ; i++) {
                for (String x: lstOfArt) {
                    if (x.charAt(0) == lstOf1stLetter[i].charAt(0)){
                        x = x.replaceAll("\\D+","");
                        sum = sum + Integer.parseInt(x);
                    }

                }
                if (i != lstOf1stLetter.length - 1) {
                    result.append("(").append(lstOf1stLetter[i]).append(" : ").append(sum).append(")").append(" - ");
                    sum = 0;
                }
                else{
                    result.append("(").append(lstOf1stLetter[i]).append(" : ").append(sum).append(")");
                }
            }
        }
        System.out.println(result);
    }
}
