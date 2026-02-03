package com.challengeConvertor;

public class ConversionMonedas {

    private final ConsultarServicio service = new ConsultarServicio();
    public void convert(int option, double amount) throws Exception{
        String from = "";
        String to = "";

        switch (option) {
            case 1 -> { from = "USD"; to = "ARS"; }
            case 2 -> { from = "ARS"; to = "USD"; }
            case 3 -> { from = "USD"; to = "BRL"; }
            case 4 -> { from = "BRL"; to = "USD"; }
            case 5 -> { from = "USD"; to = "COP"; }
            case 6 -> { from = "COP"; to = "USD"; }
        }

        double result = service.getConversion(from, to, amount);
        System.out.printf("Resultado: %.2f %s%n", result, to);
    }
}
