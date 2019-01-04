package SumDigitsInNumber;

import java.util.ArrayList;
import java.util.List;

/**
 you must create a digital root function.
 A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
 Here's how it works:
 digital_root(16)
 => 1 + 6
 => 7

 digital_root(942)
 => 9 + 4 + 2
 => 15 ...
 => 1 + 5
 => 6

 */
public class Ex1 {
    public static int digital_root(int n) {
        List<Integer> digital;
        int sum;
        sum = n;

        while (sum > 10) {
            digital = new ArrayList<>();
            while (sum > 10) {
                digital.add(sum % 10);
                sum = sum / 10;
            }
            digital.add(sum);
            sum = 0;

            for (int i = 0; i < digital.size(); i++) {
                sum += digital.get(i);
            }
            digital = null;
        }
        return sum;
    }
}
