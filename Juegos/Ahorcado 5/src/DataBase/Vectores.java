
package DataBase;

/**
 *
 * @author nFelix457
 */
public class Vectores {
    
    int pos =0;
    
    String[] easyVector = {"gallina", "zapato", "laguna", "peluches","piano",
                           "almohada","cepillo","reliquia","celular","rocas",
                           "ingresar","mensaje","adjetivo","ingles","dinero",
                           "arbol","cargador","video","ventana","juego"};
    String[] mediumVector = {"bachillerato","daltonico","caballista","ebullicion","habichuela",
                             "habilitar","galacticos","laberinto","nacimiento","pachangueo",
                             "quebrantar","sabaneros","vacacionar","vaciadores","xenofobia",
                             "babilonia","habilidades","ergonomia","computadora","avalancha"};
    String[] hardVector = {"abrillantador","absolutamente","accesibilidad","accionamiento","vulcanologico",
                           "dactilografia","farmacoterapia","hamburgueserias","iberoamericana","jerarquicamente",
                           "justificaciones","nacionalizacion","pachangueabamos","paleontologicos","sacrificabamos",
                           "ultraderechista","ultraizquierdas","universalidades","vagabundeabamos","zigzagueabamos"};
    String[] DemonVector = {"irresponsabilidad","electrodomesticos","implementaciones","otorrinolaringologo",
                            "electroencefalograma","esternocleidomastoideo","arteriosclerosis","desproporcionadisimamente",
                            "esternocleidomastoideisticamente","inconstitucionalmente","electroencefalografistas",
                            "dihidroxidofenilalaninabetacarboxilasa","alfadenobetaparahidroxifenilpropanoicotirosina",
                            "anticonstitucionalidad","antinorteamericanismo","Internacionalizacion","inconstitucionalidad",
                            "hipercaracterizacion","bioluminiscencia","desindustrializacion"};
    
    public Vectores (){
    }

    //GETS AND SETS
    public String[] getEasyVector() {
        return easyVector;
    }

    public String[] getMediumVector() {
        return mediumVector;
    }

    public String[] getHardVector() {
        return hardVector;
    }

    public String[] getDemonVector() {
        return DemonVector;
    }

    //others methods
    
    public String obtenerString (String[] vector){   
        pos = (int)(Math.random()*vector.length );
        return vector[pos];  
    }
    
    public char[] getVectorCharString (String[] vector){ 
        pos = (int)(Math.random()*vector.length );
        char[] vectorChar = new char[vector[pos].length()];
        
        for (int i = 0; i < vector[pos].length(); i++) {
            vectorChar[i] = vector[pos].charAt(i);
            System.out.print(""+vectorChar[i]);
        }
        
        return vectorChar;  
    }
}
