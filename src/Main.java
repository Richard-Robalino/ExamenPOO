//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rutas cliente1=new Rutas(123,"Richard",456,"Octubre",true,false,0.30,"Quito-Riobamba",27.50,100,"Quito ");
        Rutas cliente2=new Rutas(145,"Gustavo",4567,"Nomvimebre",false,true,0.00,"Quito-Puyo",20,100,"Quito ");
        Rutas cliente3=new Rutas(148,"Diego",458,"Diciembre",true,false,0.30,"Quito-Tulcan",15,100,"Quito ");
        Rutas cliente4=new Rutas(198,"Antonio",459,"Enero",true,false,0.30,"Quito-Guayaquil",20,100,"Quito ");
        Rutas cliente5=new Rutas(178,"Cral",410,"Febreo",true,false,0.30,"Quito-Riobamba",27.50,100,"Quito ");

        Rutas[] cliente = {cliente1 , cliente2, cliente3,cliente4,cliente5};

        System.out.println("Reservas:");
        for (Rutas reserva : cliente) {
        System.out.println("ID: " + reserva.getId());
        System.out.println("Cliente: " + reserva.getNombre());
        System.out.println("Fecha: " + reserva.getFecha_mes());
        System.out.println("Tipo Rutas: " + reserva.getCuidad());
        System.out.println("Costo: " + reserva.getPasaje());
        System.out.println();
    }

        System.out.println("Costo total cliente 1: " + cliente1.calcular());
        System.out.println("Costo total cliente 2: " + cliente2.calcular());
        System.out.println("Costo total cliente 3: " + cliente3.calcular());
        System.out.println("Costo total cliente 4: " + cliente4.calcular());
        System.out.println("Costo total cliente 5: " + cliente5.calcular());
}
}
