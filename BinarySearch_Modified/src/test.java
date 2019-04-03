public class test {
    public static void main(String args[]){
        int[] test = {0, 2, 10, 10, 10, 13, 14};
        int searchValue = 9;

        int[] foundIndex = BinarySearcher.firstAndLast(test, 0, 6, searchValue);

        System.out.println("[" + foundIndex[0] + ", " + foundIndex[1] + "]");
    }
}
