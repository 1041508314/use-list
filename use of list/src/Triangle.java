import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/19
 * @Content:
 */
public class Triangle {
    public List<List<Integer>> func(int numRows){
        List<List<Integer>>ret = new ArrayList<>();
        if(numRows == 0){
            return ret;
        }
        List<Integer>oneRow = new ArrayList<>();
        ret.add(oneRow);

        ret.get(0).add(1);//第一行的元素 添加了一个1
        //直接从第二行开始计算
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//当前行的第一个元素

            List<Integer> prevRow = ret.get(i-1);//前一行

            for (int j = 1; j < i; j++) {
                int x = prevRow.get(j);
                int y = prevRow.get(j-1);
                curRow.add(x+y);
            }
            //最后一个元素
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }

    public static void main(String[] args) {
        
    }
}