import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //1，ArrayList基本数据测试
        Array<Integer> arr = new Array<>();
        for(int i = 0 ; i < 10 ; i ++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);//时间复杂度 数据结构

        arr.removeFirst();
        System.out.println(arr);


        Integer i= 129;
        Integer i2 = 129;
        System.out.println(i==i2);
        System.out.println(0x80000000);
    }

}
