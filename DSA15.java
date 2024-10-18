public class DSA15 {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int temp[]=new int[arr.length];
        int j=0;

         for(int i=0;i<arr.length-1;i++){
              if(arr[i+1]>arr[i]){
                 temp[j++]=arr[i+1];
              }else{
                 temp[j++]=-1;
              }
         }
         temp[j]=-1;

         for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
         }
    }
}
