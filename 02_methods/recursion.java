public class recursion {
  
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

  public static int sum(int start, int end) {
    if (start > end) {
      return 0;
    } else {
      return start + sum(start + 1, end);
    }
  }

  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);

    int result2 = sum(7);
    System.out.println(result2);

    int result1 = sum(1, 77);
    System.out.println(result1);
  }
}
// The above code runs as follows:
// 10 + sum(9)
// 10 + ( 9 + sum(8) )
// 10 + ( 9 + ( 8 + sum(7) ) )
// ...
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0