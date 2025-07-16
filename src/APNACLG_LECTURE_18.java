import java.util.*;

public class APNACLG_LECTURE_18 {

    public static void Old_Or_Even(int n) {
        int BitMask = 1;

        if ((n & BitMask) == 0) {
            System.out.println("this number is a even.");
        } else{
            System.out.println("this number is odd.");
        }
    }

    public static int Get_ith_bit(int n , int i) {
        int BitMask = 1 << i;

        if ((n & BitMask) == 0) {
            return 0;
        } else{
            return 1;
        }
    }
    public static int Set_ith_bit(int n , int i) {
        int BitMask = 1 << i;

        return n | BitMask ;
    }

    public static int Clear_ith_bit(int n , int i) {
        int BitMask = ~(1 << i);

        return n & BitMask ;
    }
    public static int Update_ith_bit(int n , int i, int newbit) {
//        if (newbit==0){
//            return n= Clear_ith_bit(n,i);
//        }else{
//            Set_ith_bit(n,i);
//        }
        n = Clear_ith_bit(n,i);
        int BitMask =newbit << i ;

        return n | BitMask ;
    }
    public static int Clear_Last_ith_bit(int n , int i) {
        int BitMask = ~0 << i;

        return n & BitMask ;
    }

    public static int Clear_Range_of_ith_bit(int n , int i ,int j) {
        int a = ~0 << (j+1);
        int b = (1<<i) -1;
        int BitMask = a|b;
        return n & BitMask ;
    }
    public static boolean isPowerof2(int n){
        return (n & (n-1)) ==0;
    }

    public static int Count_Set_bits(int n){
        int count =0;
        while(n>0){
            if(((n & 1) != 0)){ // check our lsb
                count++;
            }
            n = n >> 1;
        }
        return count;

    }
    public static int fastExponentation(int a, int n) {
        // using the power value as bit number
        // if LSB of bit number is 1 multiply the answer with a and take a^2
        // if LSB of bit number is 0 the do nothing and take a^2
        int ans = 1;
        // loop till the bit form of the power goes on
        while (n > 0) {
            // cheking LSB
            if ((n & 1) != 0) {

                ans = ans * a;

            }
            // taking a square
            a = a * a;

            // shifting the bit in n
            n = n >> 1;
        }
        return ans;
    }


    public static void main(String[] args) {

//    check odd or even
        Old_Or_Even(3);

//    check what is ith possition 0 or 1 in binary
        System.out.println(Get_ith_bit(10,3));

//    Set the Ith bit what number is current after operation
        System.out.println(Set_ith_bit(10,2));

//    Clear_ith_bit
        System.out.println(Clear_ith_bit(10,1));

//    Update_ith_bit
        System.out.println(Update_ith_bit(10,2,1));

//    Clear_Last_ith_bit
        System.out.println(Clear_Last_ith_bit(15,2));

//    Clear_Range_of_ith_bit
        System.out.println(Clear_Range_of_ith_bit(10 , 2, 4));

//    isPowerof2
        System.out.println(isPowerof2(4));

//    Count_Set_bits
        System.out.println(Count_Set_bits(10));

//    fastExponentation
        System.out.println(fastExponentation(5,3));

    }
}
