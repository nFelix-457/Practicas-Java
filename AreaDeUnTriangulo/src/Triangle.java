/*
 * * Author: nFelix-457
 * * Date: 16/01/2025
 * * Description:  This class contains the characteristics of a triangle.
 * */

public class Triangle {
    //Variables
    private double base, height;

    //Constructors
    public Triangle(){}
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
        getArea();
    }

    //Gets and Sets
    public double getBase (){
        return this.base;
    }
    public double getHeight (){
        return this.height;
    }
    public double getArea (){
        return ((base * height)/2);
    }

    public void setBase (double base) {
        if(base > 0 ){
            this.base = base;
        }else{
            System.out.println("Triangle base invalid");
        }
    }
    public void setHeight (double height) {
        if(height > 0){
            this.height = height;
        }else{
            System.out.println("Triangle height invalid");
        }
    }

}
