public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        int result[];
        ArrayHandler arrayHandler = new ArrayHandler();
        Sort sort = (Sort) XMLUtil.getBean();

        arrayHandler.setSortObject(sort);
        result = arrayHandler.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
//        foreach
    }
}
