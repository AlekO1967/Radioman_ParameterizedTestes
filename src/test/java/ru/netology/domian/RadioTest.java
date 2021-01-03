package ru.netology.domian;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDecSV.csv")
    void decreaseVolume(boolean on, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIncSV.csv")
    void increaseVolume(boolean on, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource( resources = "/dataForPrevRS.csv")
    void prevRadioStation (boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInputRS.csv")
    void inputRadioStation (boolean on, int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setOn(on);
        radio.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());

    }


}


