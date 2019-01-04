package Ex1_FizzBuzz;

import java.util.HashMap;

public class FizzBuzz {
    FizzBuzz(){
    //    print();
        stringp("Success");
    }

    void print (){
        for (int i = 1; i <= 100 ; i++) {
            if (i%3 == 0 && i%5 == 0)
                System.out.print("FizzBuzz");
            else if (i%3 == 0)
                System.out.print("Fizz");
            else if (i%5 == 0)
                System.out.print("Buzz");
            else System.out.print(i);
            System.out.print(" ");
        }
    }

    void stringp (String word){
        HashMap<Character,Character> list = new HashMap<>();
        char symbol;
        String word1;
        word1 = word.toLowerCase();
        word = "";

        for (int i = 0; i <word1.length() ; i++) {

            symbol = word1.charAt(i);
            if (list.containsKey(symbol))
                list.put(symbol,')');
            else list.put(symbol,'(');
        }

        for (int i = 0; i <word1.length() ; i++) {
            symbol = word1.charAt(i);
            word=word+list.get(symbol);
        }
    }
}
