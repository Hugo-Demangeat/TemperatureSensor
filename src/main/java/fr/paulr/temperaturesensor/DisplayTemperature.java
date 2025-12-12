/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.temperaturesensor;

/**
 *
 * @author hdemangeat
 */
public class DisplayTemperature implements TemperatureObserver {
    @Override
    public void update(int temperature) {
        System.out.println("Température actuelle : " + temperature + "°C");
    }
}
