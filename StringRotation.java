public class StringRotation{
    public static void main(String[] args) {
      String s1="abcd";  
      String s2="czabv";
      System.out.println(isRotation(s1,s2));
        
    }
    static boolean isRotation(String s1,String s2){
      return s1.length()==s2.length() && (s1+s1).contains(s2);

    }
}