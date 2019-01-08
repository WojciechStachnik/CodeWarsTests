package SumOfOddNumbers;

public class main {
    public static void main(String[] args) {
        int n = 42;
        int lastNumber = 1;
        int sumInRow = 0;
        for (int i = 2; i<n; i++){
            lastNumber += 2*i;
            System.out.println(lastNumber);
        }
        System.out.println();
        sumInRow = lastNumber;
        for (int j=n; j>0;j--){
            sumInRow += (lastNumber - 2);
            System.out.println(sumInRow);
        }
    }
}
