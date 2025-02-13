import java.util.*;
class StockSpan {
  public static int[] calculateSpan(int prices[]) {
    int n = prices.length;
    int span[] = new int[n];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
        stack.pop();
      }
      span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
      stack.push(i);
    }
    return span;
  }

  public static void main(String[] args) {
    int[] prices = {1500,998,234,554,12,21,23};
    int[] spans = calculateSpan(prices);
    for (int span : spans) {
      System.out.print(span + " ");
    }
  }
}
