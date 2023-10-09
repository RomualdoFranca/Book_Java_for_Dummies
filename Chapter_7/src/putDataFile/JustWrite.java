package putDataFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
class JustWrite {
    public static void main(String args[]) throws FileNotFoundException {
        PrintStream diskWriter =
                new PrintStream("testeFile.txt");
        diskWriter.println("Romualdo França");
        diskWriter.println(1000.00);

    }
    /*You can also specify the exact location of a file on your computer's hard
    drive.

        3

        public static void main(String args[])
        throws FileNotFoundException {
            PrintStream diskWriter = new PrintStream
                 ("c:/Users/Public/Documents/cookedData.txt");
            diskWriter.println(99.75);
    */
}
