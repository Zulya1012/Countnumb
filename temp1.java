public class temp1 {
  public static void main(String[] arg) {
    int[] a = {
      10,
      -9,
      15,
      -5,
      20,
      0,
      -2,
      6,
      -1,
      14
    };
    int count = 0;
    for (int i: a) {
      if (i < 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
