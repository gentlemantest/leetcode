package leetcode.java.array;

import org.junit.Test;

/**
 * 最好时间买和卖股票
 *
 * @author zhangyu
 **/


public class BestTimeBuySell {
    @Test
    public void fun() {
        int arr[] = {1, 2, 3, 0, 2};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }


    /**
     * 找到测试数组的最大收益
     *
     * @param prices 价格数组
     * @return 最大收益
     */
    public int maxProfit(int[] prices) {
        int P_i10 = 0;
        int P_i11 = Integer.MIN_VALUE;
        int P_i10_old = 0;
        int P_i10_prev = 0;
        for (int price : prices) {
            P_i10_old = P_i10;
            P_i10 = Math.max(P_i10, P_i11 + price);
            P_i11 = Math.max(P_i11, P_i10_prev - price);
            P_i10_prev = P_i10_old;
        }
        return P_i10;
    }
}
