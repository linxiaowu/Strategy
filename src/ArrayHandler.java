
public class ArrayHandler {
    private Sort sortObject;

    public int[] sort(int arr[]) {
        sortObject.sort(arr);
        return arr;
    }

    public void setSortObject(Sort sort) {
        this.sortObject = sort;
    }

}
