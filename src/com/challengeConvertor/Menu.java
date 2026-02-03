package com.challengeConvertor;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final ConversionMonedas converter = new ConversionMonedas();

    public void start() {
        System.out.println("======================================");
        System.out.println("   BIENVENIDO AL CONVERTIDOR DE MONEDAS ");
        System.out.println("======================================");

        int option = 0;

        while (option != 7) {
            try {
                showMenu();
                option = scanner.nextInt();

                if (option >= 1 && option <= 6) {
                    System.out.print("Ingrese el monto a convertir: ");
                    double amount = scanner.nextDouble();
                    converter.convert(option, amount);
                } else if (option == 7) {
                    System.out.println("Gracias por usar el convertidor");
                } else {
                    System.out.println("Opción inválida");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private void showMenu() {
        System.out.println("""
                
                1. Dólar a Peso Argentino
                2. Peso Argentino a Dólar
                3. Dólar a Real Brasileño
                4. Real Brasileño a Dólar
                5. Dólar a Peso Colombiano
                6. Peso Colombiano a Dólar
                7. Salir
                """);
        System.out.print("Seleccione una opción: ");
    }
}
