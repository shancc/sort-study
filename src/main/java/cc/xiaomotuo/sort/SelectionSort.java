package cc.xiaomotuo.sort;

/**
 * 选择排序
 *
 * @author Cc
 * @date 2019/10/21
 */
public class SelectionSort extends AbstractSort {


    public static void main(String[] args) {
        int[] array = {12,2,3,1,6};
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sort(array);
        selectionSort.printArray(result);
    }


    /**
     * 选择排序
     * sort
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            int minIndex = i;
            for (int j = i; j < arrayLength; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
