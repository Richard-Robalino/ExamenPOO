public class Ticket extends Pasajeros {
    private int numeroticket;
    private String fecha_mes;
    public Ticket(int id,String nombre,int numeroticket,String fecha_mes){
        super(id,nombre);
        this.numeroticket=numeroticket;
        this.fecha_mes=fecha_mes;
    }

    public int getNumeroticket() {
        return numeroticket;
    }

    public String getFecha_mes() {
        return fecha_mes;
    }

    public void mostrainformacionti(){
        System.out.print("Id:"+getId()+"Nombre:"+getNombre()+"Numero de Ticket :"+getNumeroticket()+"Fecha de Ticket:"+getFecha_mes());
    }
    @Override
    public double calcular(){
        return 0;
    }

}
