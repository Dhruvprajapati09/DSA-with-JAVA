import java.util.*;

public class apnaclg_lecture_14_trappedwater {

    public static void Trappedrainwater(int height[]) {

        // leftmax boundary

        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
                leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //rightmax boundary

        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for (int i= height.length-2; i >=0 ; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int Trappedwater = 0;

        for (int i =0; i< height.length ;i++){
            //waterlevel
            int waterlevel =Math.min(leftmax[i],rightmax[i]);

            //trappedwater

            Trappedwater += waterlevel-height[i];
            System.out.println(Trappedwater);

        }

      //  return Trappedwater;




    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        //System.out.println(Trappedrainwater());
       // System.out.println(Trappedrainwater(height));
        Trappedrainwater(height);
    }
}
