package org.cly.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chang Liyao
 * @since 2020-07-27 21:11
 */

public class Test {
    public static void main(String[] args) {
            int value = 45689;
            List<Integer> list = new ArrayList();
            while(value != 0){
                int after = value % 10;
                value = value/10;
                list.add(after);
            }
        System.out.println("+++++++++");
            int newValue = 0;
            for(int i = 0;i < list.size();i++){
                Integer offset = list.get(i);
                for(int j=i; j<list.size()-1;j++){
                    offset = offset * 10;
                }
                newValue = newValue + offset;
            }
        System.out.println("======"+newValue);


        System.out.println("hahahhha");
    }
}
