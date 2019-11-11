package cc.xiaomotuo.sort;

/**
 * @author Cc
 */
public abstract class AbstractSort implements Sort {

    /**
     * 打印数组
     * @param result
     */
    public void printArray(int[] result) {
        for (int n : result) {
            System.out.println(n);
        }
    }
}
