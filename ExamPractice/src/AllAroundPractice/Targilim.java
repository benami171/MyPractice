package AllAroundPractice;

import BinaryTreePractice.BinaryTree1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Targilim {

    String s = "racecar";

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    int n = 9;

    public static int[] d_range(int n) {
        int higherPrimeNumber = higherPrime(n);
        int lowerPrimeNumber = lowerPrime(n);
        int lowerCompositeNumber = lowerPrimeNumber + 1;
        int higherCompositeNumber = higherPrimeNumber - 1;
        int[] ans = new int[]{};

        ArrayList<Integer> arrlist = new ArrayList<>();

        if (!isPrime(n)) {
            for (int i = lowerCompositeNumber; i <= higherCompositeNumber; i++) {
                arrlist.add(i);
            }


            int[] array = new int[arrlist.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = arrlist.get(i);
            }

            return array;
        }
        return ans;
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int higherPrime(int n) {
        while (!isPrime(++n)) ;
        return n;
    }

    public static int lowerPrime(int n) {
        while (!isPrime(--n)) ;
        return n;
    }


    public static boolean isPer(ArrayList<String> words, String line) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (line.contains(word)) {
                line = line.replace(word, "");
            } else {
                return false;
            }
        }
        return true;
    }


    public static String q22(String str) {
        String ans = "";
        ans += str.charAt(0);
        int i;
        for (i = 1; str.charAt(i) == ans.charAt(0); i++) {
            if (i == str.length() - 1) {
                return ans;
            }
        }
        return ans + q22(str.substring(i));
    }

    // aaabbbcccsa
    /*
    if (ans,contains(str.charat(0)) continue)
     */
    private static int index = 0;
    private static String ans = "";
    private static boolean firstTime = true;

    public static String q2(String str) {
        //String ans = "";
        if (firstTime == true) {
            ans += str.charAt(0);
            firstTime = false;
        }
        if (str.length() == 0) {
            return ans;
        }
        if (ans.charAt(index) == str.charAt(0)) {
            return q2(str.substring(1));
        } else {
            index++;
            ans += str.charAt(0);
            return q2(str.substring(1));
        }

    }

//    private static String q2Help (String str, String ans) {
//        int i;
//        while (!str.isEmpty()) {
//            for ( i = 0; i < str.length(); i++) {
//                if (str.charAt(0) == ans.charAt(0)) {
//                    q2Help(str.substring(1), ans);
//                }
//                ans += str.charAt(0);
//                        q2Help(str.substring(1), ans);
//                    }
//
//        }
//        return ans;
//    }
//
////                    ans += str.charAt(0);


    public static int Q5(String s1, String s2) {
        if (s1.length() < s2.length()) return 0;
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                boolean equalFlag = true;
                int j = 1;
                for (; j < s2.length(); j++) {
                    if (i + j < s1.length()) {
                        equalFlag = false;
                        break;
                    }
                    if (s2.charAt(j) != s1.charAt((i + j) - 1)) {
                        equalFlag = false;
                        break;
                    }
                }
                if (equalFlag) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
//      BinaryTreePractice.BinaryTree1<Integer> bt1 = new BinaryTreePractice.BinaryTree1<>();
//      bt1.add(2);
//      bt1.add(5);
//      bt1.add(7);
//      bt1.add(8);
//      bt1.add(6);
//        String str1 = "aaabbbccsyyxxa";
//        System.out.println(q2(str1));
//      System.out.println(oneTimeCharAppears(str1));
//      double[] a1 = new double[]{1,2,3,4,5,6};
//      double[] a2 = new double[a1.length];
//      for (int i = 0; i < a1.length; i++) {
//          a2[i] = a1[i];
//      }
//      System.out.println(Arrays.toString(a1));
//      System.out.println(Arrays.toString(a2));
//      a1[2] = 15;
//      System.out.println(Arrays.toString(a1));
//      System.out.println(Arrays.toString(a2));
//        BinaryTreePractice.BinaryTree1<Integer> bst = new BinaryTreePractice.BinaryTree1<>();
//        bst.add(7);
//        bst.add(34);
//        bst.add(87);
//        bst.add(5);
//        bst.add(99);
//        bst.add(101);
//        bst.add(5);
//        bst.add(99);
//        bst.add(101);
//
//        BinaryTreePractice.BinaryTreeAlgo.draw(bst);
//        System.out.println(q10(bst));
        String[] ans = allCodes();
        for (String s : allCodes()) {
            System.out.println(s);
        }
//      System.out.println(q10((bt1)));
//        String[] s1 = new String[]{"asd","asdf","asdf"};
//        String s2 = "aba";
//        System.out.println(Arrays.toString(s1));
//        sort(s1);
//        System.out.println(Arrays.toString(s1));
        //       System.out.println(isValid(s));
        //     int[] ind = new int[]{4,5,6,7,0,2,1,3};
        //      System.out.println(restoreString(s,ind));
        //    System.out.println(fizzBuzz(15));
    }

    public static String[] allCodes() {
        String[] ans = new String[5 * 4 * 3 * 2];
        int index = 0;
        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < 6; b++) {
                for (int c = 1; c < 6; c++) {
                    for (int d = 1; d < 6; d++) {
                        if (a != b && a != c && a != d && b != c && b != d && c != d) {
                            ans[index] = "" + a + b + c + d+  "#";
                            index++;
                        }
                    }
                }

            }
        }
        return ans;
    }
  
    public static ArrayList<Integer> q100(BinaryTree1<Integer> bt1) {
        ArrayList<Integer> ans = new ArrayList<>();
        q100Helper(bt1, ans);
        return ans;
    }

    public static void q100Helper(BinaryTree1<Integer> bt1, ArrayList<Integer> ans) {
        if (bt1 == null) return;
        if (bt1.getLeft() == null && bt1.getRight() == null) {
            ans.add(bt1.getRoot());
        }
        q100Helper((BinaryTree1<Integer>) bt1.getLeft(), ans);
        q100Helper((BinaryTree1<Integer>) bt1.getRight(), ans);
    }

        public static int howManyLeaves (BinaryTree1< Integer > bt1) {
            if (bt1 == null) return 0;
            int counter = 0;
            if (bt1.isLeaf()) counter++;
            return counter + howManyLeaves((BinaryTree1<Integer>) bt1.getRight()) + howManyLeaves((BinaryTree1<Integer>) bt1.getLeft());
        }

        public static boolean isLeaf (BinaryTree1 < Integer > bt1) {
            return bt1.getLeft() == null && bt1.getRight() == null;
        }
        public static void exch (String[]a,int i, int j){
            String swap = a[i];
            a[i] = a[j];
            a[j] = swap;
        }


        public static void sort (String[]arr){
            int len = arr.length;
            for (int i = 0; i < len; i = i + 1) {
                int min = minInd(arr, i, len); // min index(min,lenght)
                exch(arr, i, min);             // swaps the ith index with the min(i,min)
            }
        }

        public static int minInd (String[]a,int min, int max){
            int ans = min;
            for (int i = min + 1; i < max && i < a.length; i = i + 1) {
                if (a[i].compareTo(a[ans]) < 0) {
                    ans = i;
                }
            }
            return ans;
        }

        public static int Q55 (String s1, String s2){
            int counter = 0;
            int size = 1;
            if (s1.length() < s2.length()) return 0;
            if (!s1.contains(s2)) return 0;
            for (int i = 0; i < s1.length() - 1; i++) {
                if (s1.charAt(i) == s2.charAt(0)) {
                    for (int j = 1; j < s2.length(); j++, i++) {
                        if (s1.charAt(i + 1) == s2.charAt(j)) {
                            size++;
                        }
                    }
                    if (size == s2.length()) counter++;
                    size = 1;
                }
            }
            return counter;
        }

        public static int countSubstring (String s1, String s2){
            int count = 0;
            int i = 0;
            while ((i = s1.indexOf(s2, i)) != -1) {
                count++;
                i += s2.length() - 1;
            }
            return count;
        }


        public static boolean isValid (String s){
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && s.charAt(i) == s.charAt(i - 1)) return false;
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stack.push(s.charAt(i));
                }
                if (s.charAt(i) == ')' && !stack.isEmpty()) {
                    if ('(' == stack.peek()) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (s.charAt(i) == '}' && !stack.isEmpty()) {
                    if ('{' == stack.peek()) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (s.charAt(i) == ']' && !stack.isEmpty()) {
                    if ('[' == stack.peek()) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        public static List<String> fizzBuzz ( int n){
            List<String> ans = new ArrayList<>();
            for (int i = 1; ans.size() < n; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    ans.add("Fizz");
                }
                if (i % 5 == 0 && i % 3 != 0) {
                    ans.add("Buzz");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    ans.add("FizzBuzz");
                }
                if (i % 3 != 0 && i % 5 != 0) {
                    ans.add(String.valueOf(i));
                }
            }
            return ans;

        }

        //}


        public static String restoreString (String s,int[] indices){
            StringBuilder ans = new StringBuilder(s);
            for (int i = 0; i < indices.length; i++) {
                ans.setCharAt(i, s.charAt(indices[i]));
            }
            return ans.toString();
        }

        public static Boolean Q10 ( int n){
            int counter = 0;
            ArrayList<Integer> DividingNumbers = new ArrayList<>();
            for (int i = 2; n > 1; i++) {
                if (n < i) {
                    return false;
                }
                if (n % i == 0) {
                    n = (n / i);
                    DividingNumbers.add(i);
                    counter++;
                }
            }
            if (counter != 3) {
                return false;
            } else {
                for (int i = 0; i < DividingNumbers.size(); i++) {
                    if (!isPrime(DividingNumbers.get(i)) || DividingNumbers.get(0).equals(DividingNumbers.get(1)) || DividingNumbers.get(0).equals(DividingNumbers.get(2)) || DividingNumbers.get(1).equals(DividingNumbers.get(2))) {
                        return false;
                    }
                }
                return true;
            }
        }


        public static int[] Q12 ( double[] arr){
            int subSize = 0;
            ArrayList<Double> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr.length - 1 && arr[i] < arr[i + 1]) {
                    subSize++;
                } else {
                    if (subSize > list.size()) {
                        list.clear();
                        for (int j = i - subSize; j <= i; j++) {
                            list.add(arr[j]);
                        }
                    }
                }
                subSize = 0;
            }
            int[] ans = new int[list.size()];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = (int) Math.round(list.get(i));
                return ans;

            }
            return ans;
        }


        public static <T > ArrayList < T > q10(BinaryTree1 < T > bt1) {
            ArrayList<T> leaves = new ArrayList<>();
            leavesInOrder(bt1, leaves);
            return leaves;
        }

        public static <T > void leavesInOrder (BinaryTree1 < T > bt1, ArrayList < T > leaves){
            if (bt1 == null) {
                return;
            }
            leavesInOrder((BinaryTree1<T>) bt1.getLeft(), leaves);
            leavesInOrder((BinaryTree1<T>) bt1.getRight(), leaves);
            if (bt1.getLeft() == null && bt1.getRight() == null) {
                leaves.add(bt1.getRoot());
            }
        }

        public static String oneTimeCharAppears (String str){

            if (str == null || str.isEmpty()) {
                return "";
            }
            int counter = 0;
            String ans = "";
            char temp = ' ';
            char temp1 = ' ';
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    temp = str.charAt(i);
                    temp1 = str.charAt(j);

                    if (temp == temp1) {
                        counter++;
                    }
                }
                if (counter == 1) {
                    ans += temp;
                }
                counter = 0;
            }
            return ans;
        }

        // aabbcccxxxxa

        // abcxa
        // ans a


    }


