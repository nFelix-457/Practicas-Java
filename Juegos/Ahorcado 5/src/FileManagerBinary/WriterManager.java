
package FileManagerBinary;

import Main.Main;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *class that writes to a binary file
 * @author Felix Navarro,Leonardo Gómez,Marcell Granados,Jimmy Avila
 * @version 20-11-2019
 */
public class WriterManager {
     private ObjectOutputStream writer;

    /**
     *Class used to open binary files
     * @param fileName
     * @throws IOException
     */
    public void open(String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }

    /**
     *Method that write a binary file
     * @throws IOException
     */
    public void write() throws IOException {
        writer.writeObject(Main.personList);
    }

    /**
     *Method that close a binary file
     * @throws IOException
     */
    public void close() throws IOException {
        writer.close();
    }
}
