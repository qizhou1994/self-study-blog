package com.zq.code.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/7/26
 */
public class Code118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> listLast;
            if (i == 0) {
                listLast = new ArrayList<>();
                listLast.add(0);
                lists.add(listLast);
                continue;
            } else {
                listLast = lists.get(i - 1);
            }
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                    continue;
                }
                int temp = listLast.get(j - 1) + listLast.get(j);
                list.add(temp);
            }
            lists.add(list);
        }
        return lists;
    }
}
