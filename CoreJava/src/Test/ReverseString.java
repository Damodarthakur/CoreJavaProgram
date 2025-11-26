package Test;
class StringReverseByIteration{
    public static  String reverseStringMethod(String str) {
        String rev = "";
        for(int i = str.length()-1;i>0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }


}

public class  ReverseString{
    public static void main(String[] args) {
        System.out.println( StringReverseByIteration.reverseStringMethod("i am damodar"));
    }
}
