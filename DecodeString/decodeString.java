import java.util.Scanner;

class decodeString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the encoded string");
        String inp = sc.next();
        System.out.println(inp);
        String output = "";
        
        //Solution 1 : Normal Approah
        // for(int i = 0;i<inp.length(); i+=2)
        // {
        //     for(int j=inp.charAt(i+1)-'0'; j>0;j--)
        //     {
        //         System.out.print( inp.charAt(i));
        //     }
        // }

        // Solution 2 using Repeat method
         for (int i = 0; i < inp.length(); i += 2) 
         {
            char character = inp.charAt(i);
            int count = inp.charAt(i + 1) - '0'; 
            output += String.valueOf(character).repeat(count); 
        }

        System.out.println(output);
    }
}