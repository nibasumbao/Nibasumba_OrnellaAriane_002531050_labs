/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ornellabajou
 */
public class VitalSign {
    String date;
    double bloodPressure;
    float temperature;
    int pulse;
    boolean isConscious;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = (double) bloodPressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isIsConscious() {
        return isConscious;
    }

    public void setIsConscious(boolean isConscious) {
        this.isConscious = isConscious;
    }
    
    
    @Override
    public String toString(){
        return getDate();
    }
}
