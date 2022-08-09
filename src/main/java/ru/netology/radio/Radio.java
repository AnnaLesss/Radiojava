package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;

        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= maxStation) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }
}

