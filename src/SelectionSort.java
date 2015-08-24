/**
 * Created by linxiaowu on 15/8/24.
 * 选择排序类
 */
public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int smallestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    smallestLocation = j;
                }
            }
            arr[smallestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.print("选择排序");
        return arr;
    }
}
