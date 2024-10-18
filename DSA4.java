public class DSA4 {
   public static void main(String[] args) {
      System.out.println(~1);

      /// left shift
      System.out.println(5<<2);
      // right shift
      System.out.println(6<<3);
      System.out.println((int)(6*Math.pow(2,3)));


       /// check the number is even or not
        int n=5;
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
        int j=GetIthBIt(7,1);
        System.out.println(j);
       System.out.println(setIhBit(5,1));

       int bitmak=(1<<2);
       System.out.println("this is "+bitmak);
       System.out.println("Clear ith bit"+clearIthBit(5,2));
   } 
    public static int  GetIthBIt(int n,int i){
         int bitmask=1<<i;
         
         if((n&bitmask)==0){
            return 0;
         }else{
            return 1;
         }
    }
    public static int setIhBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearIthBit(int n,int i){
         int bitmask=~(1<<i);
          return n&bitmask;
    }

    public static int clearlastBit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

}
