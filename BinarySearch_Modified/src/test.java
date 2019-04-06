public class test {
    public static void main(String args[]){
        int[] test = {1, 1, 3, 3, 3, 4, 5};
        int searchValue = 2;

        int[] foundIndexes = BinarySearcher.firstAndLast(test, 0, 6, searchValue);

        System.out.println("[" + foundIndexes[0] + ", " + foundIndexes[1] + "]");
    }
}
