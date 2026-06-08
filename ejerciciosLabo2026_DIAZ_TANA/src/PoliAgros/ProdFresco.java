public class ProdFresco extends Producto
{
    private int TempMantenimiento;

    public ProdFresco(int tempMantenimiento, String fechaVencimiento, int NumLote, String nombre, int id, String paisOrigen, String fechaEnvasado){
        this.TempMantenimiento = tempMantenimiento;
        super(fechaVencimiento, NumLote, nombre, id, paisOrigen, fechaEnvasado);
    }

    public int getTempMantenimiento() {
        return TempMantenimiento;
    }
}