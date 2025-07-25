
public class NSort extends SortAlgorithm implements ArrayPrinter {

    @Override
    public void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");

    }

    @Override
    public int[] sort(int[] array) {
        return array;
    }

    @Override
    public String getName() {
        return "NSort";
    }
}
