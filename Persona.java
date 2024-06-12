package Actividades;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private char sexo;

    public Persona(String nombre,int edad,double estatura,char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public  int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public char getSexo() {
        return sexo;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public static void main (String[] args) {
        Persona[] persona = new Persona[];

        Arrays.stream(persona).forEach(Persona -> System.out.println(persona));
    }

}
