package FibonacciTribonacciandfriends;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        double[] signature = new double[]{1,1,1,1,1,1,1,1,1,1,1};
        int n = 10;
        int signatureLenght = signature.length;
        double temp = 0;
        double[] result = new double[n];
        if (signatureLenght > n){
            signatureLenght = n;
        }
            for (int i = 0; i <signatureLenght; i++) {
                result[i] = signature[i];
            }
            for (int i = signatureLenght; i < n ; i++) {
                for (int j = 0; j <signatureLenght ; j++) {
                    temp += result[(i - 1 - j)];
                }
                result[i] = temp;
                temp = 0;
            }
        System.out.println(Arrays.toString(result));
    }
}
