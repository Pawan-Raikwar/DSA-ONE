import java.util.ArrayList;

public class DSA5 {
  public static void main(String[] args) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
         
    ArrayList<Integer>ans=new ArrayList<>();
    int maxAct=1;
    ans.add(0);

     int lastEnd=end[0];

     for(int i=1;i<end.length;i++){
         if(start[i]>=lastEnd){
            maxAct++;
            ans.add(i);
            lastEnd=end[i];
         }
     }

     System.out.println("Max activities "+maxAct);
     for(int i=0;i<ans.size();i++){
        System.out.println("A "+ans.get(i));
     }
  }   
}
