package stringFormat;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class FormatString {
    public static void main(String[] args) {

        /*
       1- >>7<<
       2-  >> 7<<
       3-  >>7 <<
       4-  >>0000000007<<
       5-  >>+7<<
       6-  >>-7<<
       7-  >>(7)<<
       8-  >> 7.00000<<
       9-  >>HELLO<<
       10- >>x<<
       11-  >>X<<
       1° %s representa ">>"        2° %s representa "<<"
       out.printf("%s%_%s", ">>", 7, "<<\n");
      */


        //out.printf("%s%_%s", ">>", 7, "<<\n");
        //Input1: 1s
        out.printf("\nOutput1 %s%1s%s", ">>", 7, "<<\n"); //1

        // out.printf("%s%___%s", ">>", 7, "<<\n");
        //Input2: 10s

        out.printf("\nOutput2 %s%10s%s", ">>", 7, "<<\n");

        //out.printf("%s%____%s", ">>", 7, "<<\n");
        //Input3:
        out.printf("\nOutput3 %s%s%10s", ">>", 7, "<<\n");

        //out.printf("%s%____%s", ">>", 7, "<<\n");
        //Input4: 1s
        out.printf("\nOutput4 %s%5.0s%s", ">>", 7, "<<\n");




}
    }
