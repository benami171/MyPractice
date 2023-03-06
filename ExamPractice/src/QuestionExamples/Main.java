package QuestionExamples;

import java.util.*;

import static javax.management.Query.or;

public class Main {
    public static void main(String[] args) {
     //   System.out.println("Hello world!");
    //    System.out.println(q12("abcdcb"));
//          char[] charr = new char[]{'a','b','c','e'};
//          String[] arr = {"ab", "aba", "abab", "ababab"};
//          String[] stringarr = {"ababab", "abab", "ab"};
//          int[] prices = {40,30,10,20,30,30,40,50,10};
//        System.out.println(maxProfit(prices));
          double[] arr2 = {1,3,0,5,6,7};
        System.out.println(Arrays.toString(arr2));
        shuffle(arr2);
        System.out.println(Arrays.toString(arr2));
//       // System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr2)));

     //   System.out.println(guy("abxyz",2));
      //  System.out.println(targetIndices(arr3,3));
        //reverseString(charr);
        //System.out.println(charr);
        //System.out.println(longestCommonPrefix(stringarr));
      //  System.out.println(Arrays.toString(arr3));
     //   shuffle(arr3);
     //   System.out.println(Arrays.toString(arr3));
   //     System.out.println(Arrays.deepToString(Q1(2, 4)));
     //   shuffle(arr3);
    //    System.out.println(Arrays.toString(arr3));
      //  mySort(arr, new MyComparator<>());
      //  mySort(arr2, new MyComparator<>());
      //  System.out.println(Arrays.toString(arr3));
     //   mySorts(arr3);
      //  System.out.println(Arrays.toString(arr3));

        //     System.out.println(Arrays.toString(arr));
   //     System.out.println(Arrays.toString(arr2));

        for (String s : allCodes()) {
            System.out.println(s);
        }

    }
        //////////////// Q 18 ////////////////
    // 6
    // 110


        public static int fib(int n){
            if(n <= 1) return n;

            int a = 0;
            int b = 1;

            while(n-- > 1) {
                int sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }
    public static int toBinary(int n ){
        if( n == 1)
            return 1;
        return n % 2 + 10 * (toBinary(n/2));
    }
    public static int maxProfit(int[] prices) {
        // prices = [7 , 1, 300, 1, 70, 800, 20]
        int profit = 0;
        int buyDay = 0;

        for ( int i = 0 ; i  < prices.length ; i ++) {
            if ( prices[buyDay] > prices[i]) {
                buyDay = i;
            }
            profit = Math.max(profit, prices[i] - prices[buyDay]);
        }
        return profit;
    }
    // abdsb
    // zacra



    public static String guy(String s, int offset) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) + offset > 122) {
                ans += (char)(s.charAt(i) + offset - 26);
            } else {
                ans += (char)(s.charAt(i) + offset);

            }
        }
        return ans;

    }


    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ans = new ArrayList<>();

        for ( int i = 0 ; i < nums.length-1 ; i ++ ) {
            for ( int j = 0  ; j < nums.length-i-1 ; j ++ ) {
                if (nums[j] > nums[j+1] ){
                    swap(nums,j,j+1);
                }
            }
        }

        for( int i = 0 ; i < nums.length ; i ++ ){
            if ( nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }

    private static void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static String[] allCodes() {

        String[] ans = new String[5 * 4 * 3 * 2];
        int index = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                for (int k = 1; k < 6; k++) {
                    for (int l = 1; l < 6; l++) {

                        if (i!=j && i!=k && i!=l && j!=k && j!=l && k!=l){
                            ans[index] = "" +i + j+ k + l + "#";
                            index++;
                        }
                    }
                }
            }
        }
        return ans;
    }


    ////////////////////// Q 12 ////////////////////
    public static String q12(String str) {
        String ans = "";
        int[] ascii = new int[150];
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            ascii[currChar]++;    // count how many times a character is appeared.
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (ascii[currChar] == 1) {
                ans += currChar;
            }
        }
        return ans;
    }







    public static void shuffle (double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = i + (int)(Math.random()* (arr.length-i));
            swap(arr,i,randomIndex);
        }
    }

    public static void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }







    public static int[][] Q1(int n, int m) {
        int[][] matrix = new int[n][m];
        for ( int i = 0 ; i < m ; i++) { matrix [0][i] = 1; }
        for ( int j = 0 ; j < n ; j++){ matrix [j][0] = 1;}
        for( int i = 1 ; i < m ; i++ ) {
            for( int j = 1 ; j < n ;j++ ){
                matrix [j][i] =  matrix [j][i-1] + matrix [j-1][i];
            }
        }
        return matrix;
    }


    public static int[] randomIntArray(int size, int range){
        int[]arr = new int[size];
        ++range;
        for(int i=0; i<size; i=i+1) {arr[i] = (int)(Math.random()*range);}
        return arr;
    }

    //////////////////////// Q 13 //////////////////////////
    public static <T> void mySort(T[] p, Comparator<T> comp) {
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (comp.compare(p[i], p[j]) > 0) {
                    T temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
    public static void mySorts(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

        /// because I don't know what type of elements will be in the array we will
        /// use all these if's.
    public static class MyComparator<T> implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            if (o1 instanceof String s1 && o2 instanceof String s2) {
                return s1.compareTo(s2);
            }
            if (o1 instanceof Integer i1 && o2 instanceof Integer i2) {
                return i1.compareTo(i2);
            }
            if (o1 instanceof Double d1 && o2 instanceof Double d2) {
                return d1.compareTo(d2);
            }
            if (o1 instanceof Character c1 && o2 instanceof Character c2) {
                return c1.compareTo(c2);
            }
            if (o1 instanceof Boolean b1 && o2 instanceof Boolean b2) {
                return b1.compareTo(b2);
            }
            return 0;
        }
    }

    public boolean rotateString(String s, String goal) {
        String doubleS = s + s;
        return s.length() == goal.length() && doubleS.contains(goal);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        int[] ans = new int[nums.length];
        for ( int i = 0 ; i < nums.length ; i ++) {
            bucket[nums[i]]++;
        }
        for (int i = 1 ; i <= 100; i++) {
            bucket[i] += bucket[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = bucket[nums[i] - 1];
        }
        return ans;
    }

    public static String longestCommonPrefix(String[] strs) {
        if ( strs.length < 1 ){
            return "";
        }
      String prefix = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            while (strs[i].indexOf(prefix) != 0) {
               prefix = prefix.substring(0,prefix.length()-1);
            }

        }
        return prefix;
    }

    public static String removeDuplicates(String s) {
        char[] ans = s.toCharArray();
        int length = s.length();
        int i = 0;

        for (int j=0 ; j < length; j++,i++) {
            ans[i] = ans[j];
            if (i > 0 && ans[i] == ans[i -1]){
                i = i - 2;
            }
        }
        return new String(ans,0,i);
    }

    public static void reverseString(char[] s) {

        Stack<Character> stack = new Stack<>();
        for ( int i = 0 ; i < s.length ; i++){
            stack.push(s[i]);
        }
        for ( int j = 0 ; j < s.length ; j++) {
            s[j] = stack.pop();
        }
    }

}
//            97
// [0, 0, ..., 1, 1, 1,