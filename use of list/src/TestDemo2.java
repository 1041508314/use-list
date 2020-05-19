import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/19
 * @Content:
 */
public class TestDemo2 {
    public static List<Character> func(String str1 ,String str2){
        List<Character>list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> ret = func(str1,str2);
//        System.out.println(ret);
        for (char ch : ret) {
            System.out.print(ch);
        }
    }


    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
