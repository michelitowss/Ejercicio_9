public class Main {
    public static void main(String[] args){
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();

    cliente.setNombre("Michel Montero");
    cliente.setEdad(37);
    cliente.setTelefono(981432456);
    cliente.setCredito(5000000);

        System.out.println("Nombre de cliente : " + cliente.getNombre());
        System.out.println("Edad : " + cliente.getEdad());
        System.out.println("Numero de telefono : " + cliente.getTelefono());
        System.out.println("Cantidad de credito : " + cliente.getCredito());
        System.out.println("______________________________________________");

    trabajador.setNombre("Michel Montero");
    trabajador.setEdad(37);
    trabajador.setTelefono(981432456);
    trabajador.setSalario(1200000);

        System.out.println("Nombre de trabajador : " + trabajador.getNombre());
        System.out.println("edad : " + trabajador.getEdad());
        System.out.println("numero de telefono : " + trabajador.getTelefono());
        System.out.println("Salario mensual : " + trabajador.getSalario());



    }


}