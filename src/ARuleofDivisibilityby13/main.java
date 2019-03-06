package ARuleofDivisibilityby13;

public class main {
    public static void main(String[] args) {
        long n = 8529;
        long tempDigit = n;
        int[] pattern = new int[]{1, 10, 9, 12, 3, 4};
        long sum = 0;
        int patternPosition = 0;
        do {
            tempDigit = n;
            do {
                if (patternPosition == 6) {
                    patternPosition = 0;
                } else {
                    sum = sum + (tempDigit % 10) * pattern[patternPosition];
                    tempDigit = tempDigit / 10;
                    patternPosition += 1;
                }
            } while (tempDigit != 0);
            if(n != sum) {
                n = sum;
                sum = 0;
                patternPosition = 0;
            }
        }while (n != sum);
        System.out.println(n);
    }
}
