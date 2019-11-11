package cc.xiaomotuo.sort;

/**
 * 冒泡排序
 *
 * @author Cc
 * @date 2019/10/21
 */
public class MaoPaoSort extends AbstractSort {

    public static void main(String[] args) {
        int[] array = {12, 2, 3, 1, 6};
        MaoPaoSort maoPaoSort = new MaoPaoSort();
        int[] result = maoPaoSort.sort(array);
        maoPaoSort.printArray(result);
    }

    /**
     * 冒泡排序
     * sort
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
