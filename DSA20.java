public class DSA20 {
    public static void main(String[] args) {
        String s1="aman";
        String s2="aman";

        System.out.println(s1.compareTo(s2));

        System.out.println(s1.concat(s2));
            char ans=(s2.charAt(0));
        System.out.println(s1.contains("ans"));
        String ans1="k";
        System.out.println(s2.startsWith(ans1));
        System.out.println(s2.endsWith("n"));

        String b=new String("AMAN");

        System.out.println(s1.equals(b));

        System.out.println(s1.equalsIgnoreCase(b));
        System.out.println(s1.equalsIgnoreCase(b));

  
        String str="pawan";
        char ch[]=str.toCharArray();

        char chh='o';

         String chhh=ch.toString();
        for(int i=0;i<ch.length;i++){
             System.out.println(ch[i]);
        }
    }
}
