package BinaryTreePractice;

public class BinaryTreeProblems {


    public static void main(String[] args) {

        //     Comparator<String> comp = new StringComparator();
        BinaryTree1<Integer> bst = new BinaryTree1<>();
//
        bst.add(13);
        bst.add(13);

        BinaryTree1<Integer> bst2 = new BinaryTree1<>();
//
        bst2.add(13);
        bst2.add(7);


        System.out.println(isOfTheSameStructure(bst,bst2));
    //    System.out.println(Main.q99(bst,1,3));
//        bst.add(String.valueOf(87));
//        bst.add(String.valueOf(5));
                //    System.out.println(shortestPath(mat,1,1,4,4));

                //    BinaryTreePractice.BinaryTree1<Integer> bt1 = new BinaryTreePractice.BinaryTree1<>();
                //    bt1.add(6);
                //    bt1.add(8);
                //    bt1.add(6);
                //   bt1.add(14);
                //    bt1.add(47);
                //    bt1.add(80);
        BinaryTreeAlgo.draw(bst);
        BinaryTreeAlgo.draw(bst2);
                //    System.out.println(minimumheight(bt1));
                //  System.out.println(Arrays.toString(numberOfLeafsByLevel(bt1)));
    }







    public static int minimumheight(BinaryTree1<Integer> bt) {
        if (bt == null) return -1;
        if (bt.getLeft() == null && bt.getRight() == null) return 0;
        if (bt.getLeft() == null) {
            return 1 + minimumheight((BinaryTree1<Integer>) bt.getRight());
        }
        if (bt.getRight() == null) {
            return 1 + minimumheight((BinaryTree1<Integer>) bt.getLeft());
        }
        return 1 + Math.min(minimumheight((BinaryTree1<Integer>) bt.getLeft()), minimumheight((BinaryTree1<Integer>) bt.getRight()));
    }


    public static <T> int q9(BinaryTree<T> bt1, int min, int max) {
        if (min != 0) {
            if (bt1.getLeft() == null && bt1.getRight() == null) {
                return 0;
            }
            if (bt1.getRight() == null) {
                return q9(bt1.getLeft(), min - 1, max - 1);
            }
            if (bt1.getLeft() == null) {
                return q9(bt1.getRight(), min - 1, max - 1);
            }
            return q9(bt1.getLeft(), min - 1, max - 1) + q9(bt1.getRight(), min - 1, max - 1);
        }

        if (max == 0)
            return 0;
        if (bt1.getRight() == null && bt1.getLeft() == null)
            return 1;
        if (bt1.getRight() == null) {
            return q9(bt1.getLeft(), min, max - 1);
        }
        if (bt1.getLeft() == null) {
            return q9(bt1.getRight(), min, max - 1);
        }
        return q9(bt1.getLeft(), min, max - 1) + q9(bt1.getRight(), min, max - 1);

    }


    public static boolean isOfTheSameStructure(BinaryTree bt1, BinaryTree bt2) {
        if (bt1 == null && bt2 == null) return true;
        if (bt1 == null || bt2 == null) return false;
        return isOfTheSameStructure(bt1.getLeft(), bt2.getLeft()) && isOfTheSameStructure(bt1.getRight(), bt2.getRight());
    }
//    public static int height(BinaryTreePractice.BinaryTree1<Integer> bt) {
//        if (bt == null)
//            return -1;
//
//        return 1 + Math.max(height((BinaryTreePractice.BinaryTree1<Integer>) bt.getLeft()), height((BinaryTreePractice.BinaryTree1<Integer>) bt.getRight()));
//    }

    public static int minLevelLeaf(BinaryTree1<Integer> bt) {
        if (bt == null) {
            return -1;
        }
        if (bt.getLeft() == null && bt.getRight() == null) {
            return 0;
        }
        if (bt.getLeft() == null) {
            return 1 + minLevelLeaf((BinaryTree1<Integer>) bt.getRight());
        }
        if (bt.getRight() == null) {
            return 1 + minLevelLeaf((BinaryTree1<Integer>) bt.getLeft());
        }
        return 1 + Math.min(minLevelLeaf((BinaryTree1<Integer>) bt.getLeft()), minLevelLeaf((BinaryTree1<Integer>) bt.getRight()));

    }

    public static int[] numberOfLeafsByLevel(BinaryTree1<Integer> bt) {
        int index = 0;
        if (bt == null) return null;
        int[] ans = new int[(height(bt)) + 1];
        leafsHelper(bt, ans, index);
        return ans;
    }

    public static void leafsHelper(BinaryTree1<Integer> bt, int[] ans, int index) {
        if (bt == null) return;
        if (bt.getLeft() == null && bt.getRight() == null) {
            ans[index]++;
        }
        index++;

        leafsHelper((BinaryTree1<Integer>) bt.getLeft(), ans, index);
        leafsHelper((BinaryTree1<Integer>) bt.getRight(), ans, index);
    }

    public static final int BLACK = 0, WHITE = 1, GRAY = 2, MAX = 1000 * 1000 * 1000;
    static int x1;
    int x2;
    static int y1;
    int y2;

    public static int shortestPath(int[][] mat, int x1, int y1, int x2, int y2) {
        if (!isValid(mat, x1, y1) | !isValid(mat, x2, y2)) {
            return MAX;
        }
        if (x1 == x2 & y1 == y2) {
            return 0;
        }


        // recursive calls
        int l = shortestPath(mat, x1 - 1, y1, x2, y2);
        int r = shortestPath(mat, x1 + 1, y1, x2, y2);
        int u = shortestPath(mat, x1, y1 + 1, x2, y2);
        int d = shortestPath(mat, x1, y1 - 1, x2, y2);
        int min = Math.min(Math.min(l, r), Math.min(u, d));
        if (min < MAX) {
            min = min + 1;
        }
        return min;
    }

    public static boolean isValid(int[][] mat, int x, int y) {
        boolean ans = x1 >= 0 && y1 >= 0 && x1 < mat.length && y1 < mat[0].length;
        if (ans) {
            ans = mat[x][y] == WHITE;
        }
        return ans;
    }





    public static int height(BinaryTree1<Integer> bt){
        if (bt == null) return -1;
        return 1+Math.max(height((BinaryTree1<Integer>)bt.getLeft()),height((BinaryTree1<Integer>)bt.getRight()));
    }


//    public static int[] numberOfLeafsByLevel(BinaryTreePractice.BinaryTree bt) {


//    }
}

