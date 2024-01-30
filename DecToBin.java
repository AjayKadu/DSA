public class DecToBin {

    public static void BinaryConv(int n) {

        int binary = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println(binary);
    }


    public static void BinToDec(int n){
        
        int dec = 0;
        int pow = 0;

        while (n > 0) {
             
             int rem = n % 10;
             dec = dec + (rem * (int) Math.pow(2, pow));
             pow++;
             n = n/10;
        }
         System.out.println(dec);
    }


    public static void main(String[] args) {
        BinaryConv(5);
        BinToDec(101);
    }
}