public class Rutas extends Nomal_Vip {
    private String opcionrutas;
    private double pasaje;
    private double total;
    private String cuidad;
    public Rutas(int id, String nombre, int numeroticket, String fecha_mes, boolean normal, boolean vip, double recargo,String opcionrutas,double pasaje,double total,String cuidad) {
        super(id, nombre, numeroticket, fecha_mes,normal,vip,recargo);
        this.opcionrutas =opcionrutas;
        this.pasaje=pasaje;
        this.total=total;
        this.cuidad=cuidad;
    }

    public String getOpcionrutas() {
        return opcionrutas;
    }

    public double getPasaje() {
        return pasaje;
    }

    public double getTotal() {
        return total;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void rutasterrestre(){
        if(opcionrutas == "QuitoGuayaquil"){
            pasaje=20+getRecargo();
            cuidad="•Quito-Guayaquil ";
        }
        if(opcionrutas=="Quito-Puyo"){
            pasaje=15+getRecargo();
            cuidad="Quito-Puyo ";
        }
        if(opcionrutas=="Quito-Tulcan"){
            pasaje=17.50+getRecargo();
            cuidad="•Quito-Tulca ";
        }
        if(opcionrutas=="Quito-Riobamba"){
            pasaje=17.50+getRecargo();
            cuidad="•Quito-Riobamba ";
        }

    }

    @Override
    public void mostrainformacionp(){
        System.out.print("ID:"+getId()+"Nombre pasajero:"+getNombre()+"Numero de Ticket:"+getNumeroticket()+"Fecha Ticket:"+getFecha_mes()+"Rutas :"+getCuidad()+"Total:"+getPasaje());
    }
}