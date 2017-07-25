/**
 * Created by rasalp on 7/19/2017.
 */
public class MyUtil {
    /*public static int[] sort(int [] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }*/
    Employee[] sort (Employee[] obj, Compare C) {
        for (int i = 0; i < obj.length; i++){
            for (int j = i + 1; j < obj.length; ++j) {
                if (C.compare(obj[i], obj[j])) {
                    Employee temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return obj;
    }
}

