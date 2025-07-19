public class Recursion_part2 {
    public static int tilingproblem(int n) {
        // base case
        if(n == 0 || n == 1){
            return 1;
        }

        // vertical choice
        int fnm1 = tilingproblem(n - 1);

        // horizontal choice
        int fnm2 = tilingproblem(n - 2);

        // total ways
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){
//        base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

//        kaam

        char currchar =str.charAt(idx);
        if(map[currchar-'a'] == true){
//            duplicate
            removeDuplicates(str, idx+1,newStr,map);
        }else{
            map[currchar-'a'] = true;
            removeDuplicates(str, idx+1,newStr.append(currchar),map);
        }
}

    public static int friendspairing(int n){
//        base case
        if(n == 1 || n == 2){
            return n;
        }

//        Single
        int fnm1 = friendspairing(n-1);
//        for pair
        int pairchoice =friendspairing(n-1);
        int pairways =friendspairing(n-2);
//        total ways
        int totalways =fnm1 + pairchoice * pairways ;
        return totalways;
    }

    public static void printbinStrings(int n, int lastplace, String str){
//        base case
        if(n == 0){
            System.out.println(str);
            return;
        }

//        kaam
        printbinStrings(n-1,0,str +"0");
        if(lastplace == 0){
            printbinStrings(n-1,1,str +"1");
        }

    }



    public static void main(String[] args) {
//        tilingproblem
        System.out.println(tilingproblem(4));

//        removeDuplicates
        String str ="appnnacollage";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);

//        friendspairing
        System.out.println(friendspairing(3));

//        printbinStrings
        printbinStrings(3,0,"");

    }
}
