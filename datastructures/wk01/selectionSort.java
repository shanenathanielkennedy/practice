public class selectionSort {
    public static void sort(String[] x){
        sort(x, 0);
    }
    
    public static void sort(String[] x, int k){
        if (k == x.length){
            return;
        }
        int minIdx = findSmallest(x, k);
        swap(x, k, minIdx);
        sort(x, k + 1);
    }

    public static void swap(String[] arr, int i, int j){

        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int findSmallest(String[] x, int k){
        int smallestIdx = k;
        for (int i = k; i < x.length; i++){
            int comparison = x[i].compareTo(x[smallestIdx]); // returns -1 if xi is less than
            if (comparison < 0){
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }

    public static void main(String[] args){
        String[] shufflin = {"everyday", "im", "shufflin"};
        String[] pets = {"the", "cat", "scooby", "ate", "the", "dog", "loaf"};
        sort(shufflin);
        sort(pets);

        for (int i = 0; i < shufflin.length; i++){
            System.out.println(shufflin[i]);
        }
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }       
    }
}