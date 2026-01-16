package dsa.array;

import java.util.*;

public class StockbuySell {

        public int stockbuySell(int[] prices) {

            int minPrice = Integer.MAX_VALUE;

            int maxProfit = 0;

            for (int price : prices) {

                if (price < minPrice) {
                    minPrice = price;
                }
                else {
                    maxProfit = Math.max(maxProfit, price - minPrice);
                }
            }

            return maxProfit;
        }
    }

    // Driver code
    class Main {
        public static void main(String[] args) {
            StockbuySell obj = new StockbuySell();
            int[] prices = {7, 1, 5, 3, 6, 4};

            System.out.println(obj.stockbuySell(prices));
        }
    }


