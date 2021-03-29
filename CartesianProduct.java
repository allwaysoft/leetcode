import java.util.ArrayList;
import java.util.List;

public class CartesianProduct {
    public static List getCartesianProduct(List inputList) {
        List mainList = (List) inputList.get(0);
        for (int i = 1; i < inputList.size(); i++) {
            ArrayList addList = (ArrayList) inputList.get(i);
            ArrayList temp = new ArrayList();
            for (int j = 0; j < mainList.size(); j++) //每次先计算两个集合的笛卡尔积，然后用其结果再与下一个计算   
            {
                for (int k = 0; k < addList.size(); k++) {
                    ArrayList cut = new ArrayList();
                    if (mainList.get(j) instanceof ArrayList) {
                        cut.addAll((ArrayList) mainList.get(j));
                    } else {
                        cut.add(mainList.get(j));
                    }
                    if (addList.get(k) instanceof ArrayList) {
                        cut.addAll((ArrayList) addList.get(k));
                    } else {
                        cut.add(addList.get(k));
                    }
                    temp.add(cut);
                }
            }
            mainList = temp;
        }
        return mainList;
    }
 
    public static void print(List MainList) {
        for (int j = 0; j < MainList.size(); j++) {
            System.out.println(MainList.get(j));
        }
    }
// 测试
 
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        List list2 = new ArrayList();
        list2.add("1");
        list2.add("2");
        List list3 = new ArrayList();
        list3.add("x");
        list3.add("y");
        list.add(list1);
        list.add(list2);
        list.add(list3);
        List aa = getCartesianProduct(list);
        print(aa);
    }

}