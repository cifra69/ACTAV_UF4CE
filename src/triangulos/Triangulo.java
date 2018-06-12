package triangulos;

//Una subclase de DosDimensiones para Triangulo
//Triangulo.java

class Triangulo extends DosDimensiones {

    private String estilo;

    //Constructor
    Triangulo(String s, double b, double h) {
        super.setBase(b);
        super.setAltura(h);
        estilo = s;
    }

    double area() {
        return getBase() * getAltura();
    }

    void mostrarEstilo() {
        System.out.println("Triangulo es: " + estilo);
    }
}
