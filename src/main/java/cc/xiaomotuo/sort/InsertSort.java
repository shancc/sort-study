package cc.xiaomotuo.sort;

/**
 * @author Cc
 * @date 2019/10/21
 */
public class InsertSort extends AbstractSort {

    public static void main(String[] args) {
        int[] array = {12, 2, 3, 1, 6};
        InsertSort insertSort = new InsertSort();
        int[] result = insertSort.sort(array);
        insertSort.printArray(result);
    }

    /**
     * 插入排序
     * sort
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
