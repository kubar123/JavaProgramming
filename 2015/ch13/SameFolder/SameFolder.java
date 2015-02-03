/*
 * Create two files using any word-processing program or text editor. Write an
application that determines whether the two files are located in the same folder.
Save the file as SameFolder.java
 */
package samefolder;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class SameFolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileSystem fs = FileSystems.getDefault();
        Path path1=fs.getPath("H:\\OneDrive\\2014\\programming fund\\!Java\\"
                + "netbean\\workspace\\JavaProgramming\\ch13\\SameFolder\\src\\"
                + "samefolder\\file1.txt");
        FileSystem fs2=FileSystems.getDefault();
        Path path2=fs2.getPath("H:\\OneDrive\\2014\\programming fund\\!Java\\"
                + "netbean\\workspace\\JavaProgramming\\ch13\\SameFolder\\"
                + "src\\samefolder\\file2.txt");
        
        if(path1.getParent().equals(path2.getParent()))
            System.out.println("same folder");
        System.out.println("\npath1: "+path1.getParent()+"\nPath2: "+path2.getParent());
        
       
        //Path path=
    }
    
}
