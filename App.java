public class App {
    public static void main(String[] args) {

        //int array[] = {85,99,98,97,96,95,94,93,92,91,90,89, 87,86, 74};
        
        int array[] = {85,99,98,97,96,95,94,93,92,91,90,89, 87,86, 74};

        MergeSort sorting = new MergeSort();

        System.out.println("Given array is");
        sorting.printArray(array);

        sorting.mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array is");
        sorting.printArray(array);

    }
}
