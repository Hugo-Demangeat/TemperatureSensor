/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package fr.paulr.temperaturesensor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilisateur
 */
public class TemperatureSensor {
    private int temperature;
    private List<TemperatureObserver> observers = new ArrayList<>();

    public void addObserver(TemperatureObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(TemperatureObserver obs) {
        observers.remove(obs);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver obs : observers) {
            obs.update(temperature);
        }
    }
}
