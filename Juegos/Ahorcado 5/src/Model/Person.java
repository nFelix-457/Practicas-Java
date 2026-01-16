package Model;
import java.io.Serializable;

/**
 * This Class contains the characteristics belonging to a person
 * @author Felix Navarro,Leonardo Gómez, Marcell Granados, Jimmy Avila
 * @version 18-11- 2019
 */
public class Person implements Serializable{
    //people's attributes: username and password
    private String userName;
    private String password;
    
    /**
     * builder: person class
     * @param userName the parameter that defines the username of the player.
     * @param passWord the parameter that defines the player password
     */
    public Person(String userName, String passWord) {
        this.userName = userName;
        this.password = passWord;
    }//builder's closure
    public Person() {
    }  
/**
 *method that returns the player password
 * return the passWord of the player
 */
    public String getUserName() {return userName;}
 /**method that returns the username of the player
 * @return player password
 */
    public String getPassWord() {return password;}
    
 /**
  * Method that resides by parameters a username
  * @param userName 
  */
    public void setUserName(String userName) {this.userName = userName;}
 /**
  * Method that resides by parameters a password
  * @param passWord 
  */
    public void setPassWord(String passWord) {this.password = passWord;}
    
 /**
  * Method returns the person's data (username and password)
  * @return username and password 
  */ 
    @Override
    public String toString() {
        return "Person{" + "userName=" + userName + ", password=" + password;
    }
}
