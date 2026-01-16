
package FileManagerBinary;

import Model.PersonList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *Class used to read binary files
 * @author Felix Navarro,Leonardo Gomez,Marcell Granados,Jimmy Avila
 * @version 20-11-2019
 */
public class ReaderManager {
    
    
     private ObjectInputStream reader;

    /**
     *Method that resides a binary file by parameters, to open it
     * @param fileName
     * @throws IOException
     */
    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    /**
     *Method that reads a binary file
     * @return (PersonList) reader.readObject();
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public PersonList read() throws IOException, ClassNotFoundException {
        return (PersonList) reader.readObject();
    }

    /**
     *Method that closes a binary file
     * @throws IOException
     */
    public void close() throws IOException {
        reader.close();
    }
}
