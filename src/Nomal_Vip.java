public class Nomal_Vip extends Ticket {
    private Boolean normal;
    private Boolean vip;
    private double recargo;
    public Nomal_Vip(int id,String nombre,int numeroticket,String fecha_mes,boolean normal,boolean vip, double recargo){
        super(id,nombre,numeroticket,fecha_mes);
        this.normal=normal;
        this.vip=vip;
        this.recargo=recargo;
    }

    public Boolean getNormal() {
        return normal;
    }

    public Boolean getVip() {
        return vip;
    }

    public double getRecargo() {
        return recargo;
    }

    public double normalovip(){
        if (normal){
            recargo=0;
        }
        if (vip){
            recargo=0.30;
        }
        return recargo;

    }

}
