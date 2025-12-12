/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.temperaturesensor;

/**
 *
 * @author hdemangeat
 */
public class TriggerAlarm implements TemperatureObserver {
    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            System.out.println("Alerte : température trop élevée !");
        }
    }
}
