package csmsolucoes.desenvolvimento.demo;

import java.util.Scanner;

public class CelsiusToFahrenheit {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite a temperatura em Celsius: ");
      double celsius = scanner.nextDouble();
      scanner.close();
      double fahrenheit = (celsius * 9/5) + 32;
      System.out.println(celsius+"°C é igual a "+fahrenheit+"°F.");
   }
}