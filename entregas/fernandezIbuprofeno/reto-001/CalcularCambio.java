class Cambio{
    public static void main(String[] args){

        int entrega = 400;
        int debe = 232;
        int ahoraTrabajando;
        int cantidadBilletes;
        int pendientePorDevolver = entrega - debe;

        ahoraTrabajando = 100;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");

        ahoraTrabajando = 50;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");

        ahoraTrabajando = 20;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");

        ahoraTrabajando = 10;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");

        ahoraTrabajando = 5;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");

        ahoraTrabajando = 2;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");

        ahoraTrabajando = 1;
        cantidadBilletes = pendientePorDevolver/ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver%ahoraTrabajando;
        System.out.println(cantidadBilletes + " billetes de " + ahoraTrabajando + "€");
    }
}
