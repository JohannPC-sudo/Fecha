/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @johann lopez
 */
public class Fecha {

    // Atributos
    private int año;
    private int mes;
    private int día;

    // Constructor
    public Fecha(int año, int mes, int día) {
        this.año = año;
        this.mes = mes;
        this.día = día;
    }

    // Métodos setters
    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDía(int día) {
        this.día = día;
    }

    // Métodos getters
    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDía() {
        return día;
    }

    // Método para mostrar la fecha
    public String mostrarFecha() {
        return String.format("%04d-%02d-%02d", año, mes, día);
    }

 
    public static void main(String[] args) {
        Fecha miFecha = new Fecha(2024, 8, 14);
        System.out.println("Fecha de hoy: " + miFecha.mostrarFecha());

        
    }
}

    
    

