/**
 * Created by linxiaowu on 15/8/25.
 * 插入排序
 */
public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp)
                    arr[j] = arr[j - 1];
                else
                    break;
            }
            arr[j] = temp;
        }
        System.out.print("插入排序");
        return arr;
    }
}
