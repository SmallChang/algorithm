package org.cly.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.util.StringUtils;

/**
 * @author Chang Liyao
 * @since 2020-08-07 13:34
 */


public class TestInteger {
    public static void main(String[] args) {
        String s= "MXIV";
        char[] chars = s.toCharArray();
        int sum = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        for (int i =chars.length-1 ;i >= 0 ;i--){
            String a = String.valueOf(chars[i]);
            String b = "";
            if(i - 1 >= 0){
                b = String.valueOf(chars[i - 1]);
            }
            Integer current = map.get(a);
            Integer last = Objects.isNull(map.get(b)) ? 0 : map.get(b);
            if(current> last){
                String c = b+a;
                sum = sum + map.get(c);
                i--;
            }else {
                sum = sum + map.get(a);
            }
        }
        System.out.println(sum);
    }
}

