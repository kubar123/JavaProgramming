/*
 * 
Create a file using any word-processing program or text editor. Write an
application that displays the file’s name, containing folder, size, and time of last
modification. Save the file as FileStatistics.java.
 */

package filestatistics;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class FileStatistics {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("H:\\OneDrive\\2014\\programming fund\\!Java\\"
                + "netbean\\workspace\\JavaProgramming\\ch13\\FileStatistics\\"
                + "src\\filestatistics\\doc1.txt");
        System.out.printf("Name: %s",path.getFileName());
        System.out.printf("\nContaining folder: %s",path.getParent());
        BasicFileAttributes attr=Files.readAttributes(path, BasicFileAttributes.class);
        FileTime time = attr.lastModifiedTime();
        System.out.printf("\nLast Modification: %s",time);
        File file = new File("H:\\OneDrive\\2014\\programming fund\\!Java\\"
                + "netbean\\workspace\\JavaProgramming\\ch13\\FileStatistics\\"
                + "src\\filestatistics\\doc1.txt");
        System.out.printf("\nSize: %s Bytes",file.length());
        
    }
    
}
