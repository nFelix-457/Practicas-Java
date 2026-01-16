package Main;
import Model.PersonList;
import View.Start;
import java.io.IOException;
/**
 *This class starts the execution of the trivia game
 * 17/02/2022
 * @author Felix Navarro,Leonardo Gómez,Marcell Granados, Jimmy Avila
 */
public class Main {
    //Vectores de preguntas    
    
    //Vector de Personas ***NO TOCAR***
    public static PersonList personList = new PersonList();
     // Insancia ReaderManager   
    
    /**
     * Method that starts the class the trivia game
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        //Preguntas
     
// Abrir archivo y asignarlo al vector de preguntas de Verdadero/Falso;


        Start start = new Start();
        start.setVisible(true);
    }
    
}
