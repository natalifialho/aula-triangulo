/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulatriangulo;

/**
 *
 * @author glbra
 */
public class AulaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite o cateto 1: ");
        double c1 = sc.nextDouble();

        System.out.print("Digite o cateto 2: ");
        double c2 = sc.nextDouble();

        Triangulo t = new Triangulo();
        t.setC1(c1);
        t.setC2(c2);

        double area = t.calculaArea();
        double hipotenusa = t.calculahipotenusa();

        System.out.println("Area: " + area);
        System.out.println("Hipotenusa: " + hipotenusa);

        sc.close();
    }
    
}
