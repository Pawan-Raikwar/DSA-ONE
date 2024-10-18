import java.util.*;
public class DSA22 {
  public static void main(String[] args) {
      Queue<Integer>q=new ArrayDeque<>();
      Queue<Integer>qq=new LinkedList<>();

      q.add(12);
      q.add(13);

      qq.add(78);
      qq.add(25);

      while (!q.isEmpty() && !qq.isEmpty() ) {
        System.out.println(q.remove());
        System.out.println(qq.remove());
      }
  }   
}
