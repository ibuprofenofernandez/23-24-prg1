class CambioMejorado {
    public static void main(String[] args) {

        int entrega = 400;
        int debe = 232;
        int ahoraTrabajando;
        int cantidadBilletes;
        int pendientePorDevolver = entrega - debe;
        String mensaje = "";

        ahoraTrabajando = 100;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        ahoraTrabajando = 50;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        ahoraTrabajando = 20;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        ahoraTrabajando = 10;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        ahoraTrabajando = 5;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        ahoraTrabajando = 2;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        ahoraTrabajando = 1;
        cantidadBilletes = pendientePorDevolver / ahoraTrabajando;
        pendientePorDevolver = pendientePorDevolver % ahoraTrabajando;
        mensaje = mensaje + ((cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + ahoraTrabajando + "€\n" : "");

        System.out.println(mensaje);
    }
}
