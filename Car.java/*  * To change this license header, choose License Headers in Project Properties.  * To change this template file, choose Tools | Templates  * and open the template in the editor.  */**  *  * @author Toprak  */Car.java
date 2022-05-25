/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toprak
 */
public class Car {
    
    private String color;
    private String model;
    private double engine;
    private String fuel;
    private int kilometers;
    private boolean Ilan;    
    
    
    public Car (String color, double engine, String model, String fuel, int kilometers){
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.fuel = fuel;
        this.kilometers = kilometers;
    }
    
    
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getKilometers() {
        
    
        if (this.kilometers > 200000) {
            
            System.out.println("İlan yayınlanamadı. Sebep: KM 200.000'den fazla olamaz.");
         
                   return this.kilometers;

        }
            else {
                  
                       System.out.println("İlan yayındadır.");
                                  

                       return this.kilometers;
    }
       
    
}
    
     public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
     
     public void showInfos(){
          System.out.println("Araç Modeli:" +this.model);
                System.out.println("Araç Motoru:" +this.engine);
                        System.out.println("Araç Rengi:" +this.color);
                         System.out.println("Araç Yakıtı:" +this.fuel);
                                System.out.println("Araç Kilometresi:" +this.kilometers);
     }
}

        
    

