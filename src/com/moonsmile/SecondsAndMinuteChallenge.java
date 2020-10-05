package com.moonsmile;

public class SecondsAndMinuteChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hour = minutes / 60;
        long remainingMinutes =  minutes % 60;
        long day = hour / 60;

        return String.format(day + " days " + hour + " hr "+ remainingMinutes + " mins " +
                seconds + " sec");
    }

    static String getDurationString(int seconds) {
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long numberOfDay = seconds / 86400;
        long numberOfHours = (seconds % 86400) / 3600;
        long numberOfMinutes = ((seconds % 86400) % 3600) / 60;
        long numberOfSeconds = ((seconds % 86400) % 3600) % 60;

        return String.format(numberOfDay + " days " + numberOfHours + " hr "+ numberOfMinutes + " mins " +
                    numberOfSeconds + " sec");
        }
    }
