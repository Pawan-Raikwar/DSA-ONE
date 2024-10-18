public class DSA2 {
    public static void main(String[] args) {
        String str="Pawan";

        //System.out.println(str.substring(0,4));
       subString(str, 0, 5);
      //System.out.println(ans);
    }
    public static void subString(String str,int si,int ei){
        String ans="";

        for(int i=si;i<ei;i++){
            for(int j=i;j<str.length();j++){

                ans+=str.charAt(j);
            }
            System.out.print(ans);
            ans="";
            System.out.println();
        }

        
    }
}
