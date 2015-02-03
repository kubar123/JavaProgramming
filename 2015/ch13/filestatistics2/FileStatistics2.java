/*
 * Create a file that contains your favorite movie quote. Use a text editor such as
Notepad, and save the file as quote.txt. Copy the file contents, and paste them into
a word-processing program such as Word. Save the file as quote.docx. Write an
application that displays the sizes of the two files as well as the ratio of their sizes to
each other. Save the file as FileStatistics2.java.
 */
package filestatistics2;

import java.io.File;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class FileStatistics2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("H:\\OneDrive\\2014\\programming fund\\!Java\\"
                + "netbean\\workspace\\JavaProgramming\\ch13\\FileStatistics2\\"
                + "src\\filestatistics2\\quote.txt");
        
        File file2 = new File("H:\\OneDrive\\2014\\programming fund\\!Java\\"
                + "netbean\\workspace\\JavaProgramming\\ch13\\FileStatistics2\\"
                + "src\\filestatistics2\\quote.docx");
        System.out.printf(".txt size: %s Bytes\n.docx size: %s Bytes",
                file.length(),file2.length());
        long f1=file.length();
        long f2=file2.length();
        System.out.println(f1);
        double ratio=((double) f1/f2);
        
        System.out.println("ratio: "+ratio);
    }
    
}
