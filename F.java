import java.util.ArrayList;
import static java.lang.System.arraycopy;
/**
 * Created with IntelliJ IDEA.
 * User: MIKA
 * Date: 22.09.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class F {
    int[] arr = {};
    void add (int index, int element){
        int[] tmpArray = new int [arr.length+1];
        arraycopy(arr, 0, tmpArray, 0, index);
        arraycopy(arr, index, tmpArray, index+1, arr.length-index);
        tmpArray[index] = element;
        this.arr = tmpArray;
    }
    public static void main(String[] args) {
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

