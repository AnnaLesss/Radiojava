package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberStation;

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


<<<<<<< HEAD
    public int getCurrentVolume() {

        return currentVolume;
=======
    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
        numberStation = 10;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
>>>>>>> lombok
    }

    public int getCurrentStation() {

        return currentStation;
    }

<<<<<<< HEAD
=======
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }


    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }


>>>>>>> lombok
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
<<<<<<< HEAD
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = 10;
=======
        if (newCurrentVolume >= maxVolume) {
            newCurrentVolume = 100;
>>>>>>> lombok
        }
        currentVolume = newCurrentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > numberStation) {
            return;

        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
<<<<<<< HEAD
            currentVolume = maxVolume;
=======
            currentVolume = 100;
>>>>>>> lombok
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
<<<<<<< HEAD
        if (currentStation >= maxStation) {
=======
        if (currentStation < numberStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= numberStation) {
>>>>>>> lombok
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = 9;
        }
    }
}

