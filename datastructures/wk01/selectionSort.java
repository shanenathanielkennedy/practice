public class selectionSort {
    public static void sort(String[] x){
    }
    
    public static String findSmallest(String[] x){
        int smallestIdx = 0;
        for (int i = 0; i < x.length; i++){
            int comparison = x[i].compareTo(x[smallestIdx]); // returns -1 if xi is less than
            if (comparison < 0){
                smallestIdx = i;
            }
        }
        return x[smallestIdx];
    }

    public static void testfindSmallest(){
        String[] input = {"here", "comes", "the", "rain", "again"};
        String expected = "again";
        String[] actual = selectionSort.findSmallest(input);
        org.junit.Assert.assertArrayEquals(expected, actual);

    }
}