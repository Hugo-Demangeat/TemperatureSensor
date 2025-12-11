/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package fr.paulr.temperaturesensor;

/**
 *
 * @author Utilisateur
 */
public class TemperatureSensor {

    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        // Mauvaise pratique : appel direct et rigide
        displayTemperature();
        triggerAlarm();
    }

    private void displayTemperature() {
        System.out.println("Température actuelle : " + temperature + "°C");
    }

    private void triggerAlarm() {
        if (temperature > 30) {
            System.out.println("Alerte : température trop élevée !");
        }
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.setTemperature(25);
        sensor.setTemperature(35);
    }
}
