package String;

public class StringPermutation {

    static void printpermutation(String input, String result){

        //If the string in empty
        if(input.length() == 0){
            System.out.println(result+" ");
            return;

        }
        for(int i = 0;i<input.length();i++){
            //ith character of the string
            char ch = input.charAt(i);

            //Rest of the string after excluding ith value
            String rest = input.substring(0,i)+ input.substring(i+1);

                //Recusive call
            printpermutation(rest,result+ch);
        }
    }

    public static void main(String[] args) {
        String inputString  = "ABC";
        printpermutation(inputString,"");
    }

}
