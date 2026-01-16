package Model;

import static Main.Main.personList;
import java.io.Serializable;

/**
 *This class contains a person vector and their respective methods
 * @author Felix Navarro,Leonardo Gomez,Marcell Granados,Jimmy Avila
 * @version 18-11-2019
 */
public class PersonList implements Serializable {
//attributes of the PersonList class
    private Person[] personList;
    private int personCounter = 0;
    private int person2 = 0;

    /**
     *Builder: Method that resides a number of people per parameter 
     * and equals it to the vector attribute of people.
     * @param personList people vector
     */
    public PersonList(Person[] personList) {
        this.personList = personList;
    }
    
/**
 * Builder:initialize the vector of people with 20 spaces
 */
    public PersonList() {
        personList = new Person[20];
    }
    
/**
 * Method that returns the vector of people
 * @return [] personList
 */
    public Person[] getPersonList() {
        return personList;
    }

  /**
   * Method that the people counter returns
   * @return personCounter
   */
    public int getPersonCounter() {
        return personCounter;
    }

    /**
     * Method that resides the one people vector
     * @param personList 
     */
    public void setPersonList(Person[] personList) {
        this.personList = personList;
    }

    /**
     * Method that return the one index which belongs to a specific peronas of the vector
     * @param index
     * @return [index]personList
     */
    public Person getPerson(int index) {
        return personList[index];
    }
    
    /**
     * Method that returns a position of a specific user
     * @return person2
     */
        public int getPerson2() {
            return person2;
        }

        /**
         * Method that receives a specific position from a vector user
         * @param pos it's a position
         */
    public void setPerson2(int pos) {
        this.person2 = pos;
    }

/**
 * Method that adds a person within the vector
 * @param person 
 */
    public void addPerson(Person person) {
        if (personCounter == personList.length) {
            duplicator();
            personList[personCounter] = person;
            personCounter++;
        } else {
            personList[personCounter] = person;
            personCounter++;
        }
    }

    /**
     * Method that doubles the vector of people
     */
    public void duplicator() {

        Person[] personTemp;
        personTemp = new Person[personList.length];
        System.arraycopy(personList, 0, personTemp, 0, personList.length);
        this.personList = new Person[(personTemp.length) * 2];
        System.arraycopy(personTemp, 0, personList, 0, personTemp.length);
    }
}
