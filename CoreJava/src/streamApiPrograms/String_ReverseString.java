package streamApiPrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class String_ReverseString {
    public static void main(String[] args) {

                String str = "maidam";

                String reversedStr = IntStream.range(0, str.length())
                        .mapToObj(i -> str.charAt(str.length() -1-i))
                        .map(String::valueOf)
                        .collect(Collectors.joining());

                System.out.println(reversedStr);

                //check whether string pallindrome or not

        if(str.equals(reversedStr)){
            System.out.println(str + " is pallindrome ");
        }
        else System.out.println(str + " is not palindrome");
        //     OR
        System.out.println("--By using Boolean----------");
        Boolean isPallindrome = str.equals(reversedStr);

        System.out.println(str+" isPallindrome " +isPallindrome);



    }
}
