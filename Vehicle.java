  
package sample

public class Vehicle {
    String vehicle;
    Engine engine;
    Size size;
    Color color;
  
    public Vehicle(String vehicle, Engine engine, Size size, Color color){
        this.size = size;
        this.engine = engine;
        this.vehicle = vehicle;
        this.color = color;
    }


    //zestaw danych
    @Override
    public String toString()
    {
        return "Marka "+ vehicle + "\nSilnik " + engine.engine + "\nDługośc " + size.size + "\nKolor "+ color.color;
    }

}
