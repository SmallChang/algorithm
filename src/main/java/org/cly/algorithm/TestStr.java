package org.cly.algorithm;

import org.springframework.util.StopWatch;
import org.springframework.util.StringUtils;

/**
 * @author Chang Liyao
 * @since 2020-08-09 15:33
 */

public class TestStr {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        StopWatch stopWatch = new StopWatch("公共最长前缀");
        stopWatch.start("");
        longestCommonPrefix01(strs);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    public static String longestCommonPrefix01(String[] strs) {
        String result = "";
        if(strs.length == 0){
            return result;
        }
        //flower
        String firstStr = strs[0];
        for(int i =0;i<firstStr.length();i++){
            //f
            String str = String.valueOf(firstStr.charAt(i));

            String beforeStr = "";
            Boolean flag = true;
            for(int j=1;j < strs.length;j++){
                String nextStr = strs[j];
                if(nextStr.length() <= i){
                    flag = false;
                    break;
                }
                String c = String.valueOf(nextStr.charAt(i));
                if(!str.equals(c)){
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                break;
            }
            result = result + str;
        }
        return result;
    }


    public static String longestCommonPrefix02(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    //substring亮点
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefix03(String[] strs){




        return "";
    }
}
