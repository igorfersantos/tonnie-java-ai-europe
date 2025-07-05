//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("First value %s (binary representation = %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Second value %s (binary representation = %s)\n", value2, binary2);
        var result = value1 ^ value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s ^ %s = %s (binary representation = %s)\n", value1, value2, result, binaryResult);
        var result2 = ~value1;
        var binaryResult2 = Integer.toBinaryString(result2);
        var result3 = ~value2;
        var binaryResult3 = Integer.toBinaryString(result3);
        System.out.printf("~value1 = %s (binary representation = %s)\n", result2, binaryResult2);
        System.out.printf("~value2 = %s (binary representation = %s)\n", result3, binaryResult3);
        /*
        0 = false
        1 = true
        110 | 101 = 111 (7)
        110 & 101 = 100 (4)
        110 ^ 101 = 011 (3)
        ~110 = -7 (binary representation = 11111111111111111111111111111001)
        ~101 = -6 (binary representation = 11111111111111111111111111111010)
         */

        // Shift operators
        System.out.println();
        System.out.println("===============");
        System.out.println("Shift operators");
        System.out.println("===============");
        var shiftResult1 = value1 << 2;
        var shiftResult2 = ~value1 << 2;
        System.out.printf("%s << 2 = %s (binary representation = %s)\n", value1, shiftResult1, Integer.toBinaryString(shiftResult1));
        System.out.printf("~value1(%s) = %s. %s << 2 = %s (binary representation = %s)\n", value1, result2, result2, shiftResult2, Integer.toBinaryString(shiftResult2));

        var shiftResult3 = value1 >> 2;
        var shiftResult4 = ~value1 >> 2;
        var shiftResult5 = value1 >>> 2;
        System.out.printf("%s >> 2 = %s (binary representation = %s)\n", value1, shiftResult3, Integer.toBinaryString(shiftResult3));
        System.out.printf("~value1(%s) = %s. %s >> 2 = %s (binary representation = %s)\n", value1, result2, result2, shiftResult4, Integer.toBinaryString(shiftResult4));
        System.out.printf("%s >>> 2 = %s (binary representation = %s)\n", value1, shiftResult5, Integer.toBinaryString(shiftResult5));

    }
}