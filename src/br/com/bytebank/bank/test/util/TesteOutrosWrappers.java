package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {
        int number = 5;

        Double dRef = Double.valueOf(number);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        List<Number> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(17.5f);
        numbers.add(87.1d);


    }
}
