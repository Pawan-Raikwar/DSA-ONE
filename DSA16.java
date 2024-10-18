import java.util.Stack;
public class DSA16 {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();

        int nextGrea[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
              while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                    s.pop();
              }
              if(s.isEmpty()){
                 nextGrea[i]=-1;
              }else{
                  nextGrea[i]=arr[s.peek()];
              }
              s.push(i);
        }

        for(int i=0;i<nextGrea.length;i++){
             System.out.print(nextGrea[i]+" ");

        }
        System.out.println();
    }
}
