import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/19
 * @Content:
 */
public class TestMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1,"abc");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("bit");

        list.addAll(list1);
        System.out.println(list1);

        System.out.println(list);
        String ret = list.remove(0);
        System.out.println(ret);

        list.remove("bit");
        System.out.println(list);
        System.out.println("=============");

        ret = list.get(0);
        System.out.println(ret);

        System.out.println("===========");
        list.set(0,"lxy");//把已有位置改变 相当于是更新
        System.out.println(list);
        System.out.println("===========");

        System.out.println(list.contains("lxy"));


        System.out.println(list.indexOf("lxy"));//返回第一个所在下标
        System.out.println("===========");

        list.add("haha");
        System.out.println(list);
        System.out.println(list.lastIndexOf("lxy"));//返回最后一个下标  相当于从后往前查找第一个出现的位置
        System.out.println("===========");

        List<String> retList = list.subList(0,2);
        System.out.println(retList);

        list.clear();
        System.out.println(list);
    }
}
