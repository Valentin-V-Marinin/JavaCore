package main;

import timeCounting.*;

public class Main {
    public static void main(String[] args) {
        TimePrinter timePrinter = new TimePrinter(new TimeCounter(new DataReciever().getDate()));
        timePrinter.print();
    }
}
