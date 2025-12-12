/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.temperaturesensor;

/**
 *
 * @author hdemangeat
 */

public class Main {
    public static void main(String[] args) {

        TemperatureSensor sensor = new TemperatureSensor();

        sensor.addObserver(new DisplayTemperature());
        sensor.addObserver(new TriggerAlarm());

        sensor.setTemperature(25);
        sensor.setTemperature(35);
    }
}

