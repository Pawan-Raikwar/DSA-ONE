import java.util.Stack;
public class DSA13 {

     public static String reverseString(String str){
         Stack<Character>s=new Stack<>();
         int idx=0;

         while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
         }
         StringBuilder result=new StringBuilder("");

         while (!s.isEmpty()) {
             char curr=s.pop();
             result.append(curr);
            
         }
         return result.toString();
     }
     
    public static void main(String[] args) {
        String str="abc";
        //String result=reverseString(str);
        //System.out.println(result);

        for(int i=str.length()-1;i>=0;i--){
             System.out.print(str.charAt(i));
        }
    }
}
