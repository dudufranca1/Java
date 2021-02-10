package exercicios;

import java.util.Scanner;
 
public class Prova1{
 
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
 
        // Declarando as variáveis
        double massaInicial, massaFinal,tempoHoras,tempoMinutos,tempoSegundos;
        // Inicializando as variávies
        tempoSegundos =0;
        
        System.out.print("Informe a massa inicial(g): ");
        massaInicial = sc.nextDouble();
        massaFinal = massaInicial;
        
        while(massaFinal>0.5){
                massaFinal = massaFinal/2;
                tempoSegundos = tempoSegundos + 50;
        }
        // Calcular tempo
        tempoMinutos = tempoSegundos/60;
        tempoHoras  = tempoMinutos/60; 
       
        System.out.println("Tempo em segundos: " + tempoSegundos);
        System.out.println("Tempo em minutos: " + tempoMinutos);
        System.out.println("Tempo em horas: " + tempoHoras);
        
        sc.close();
}
 
 
}