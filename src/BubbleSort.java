/**
 * Created by linxiaowu on 15/8/22.
 * 冒泡排序
 */
public class BubbleSort implements Sort {


    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.print("冒泡排序");
        return arr;
    }


}
