package leetcode;

import java.util.Arrays;

/**
 * Created by F7753 on 6/7/16.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length < 2)
            return 0;
        int maxProfit = 0;
        int min = prices[0];
        for (int p : prices){
            if (p >= min)
                maxProfit = (p - min > maxProfit) ? p - min : maxProfit;
            else
                min = p;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] test = {1, 5, 7, 10, 1, 23, 4};
        BestTimetoBuyandSellStock bt = new BestTimetoBuyandSellStock();
        System.out.println(bt.maxProfit(test));
    }
}
