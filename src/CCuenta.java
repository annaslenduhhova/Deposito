
/**
 * Esta clase se utiliza para ingresar y retirar la cantidad de dinero de un cliente.
 * 
 * @author Anna Slenduhhova
 * @version 1.0.0
 * @since 1.0.0
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Construcor sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor que inicializa los parametros de clase CCuenta 
     * @param nom Nombre del cliente
     * @param cue Número de la cuenta
     * @param sal Saldo en la cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Muestra el saldo de la cuenta
     * @return devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Con este método se ingresa el dinero a la cuenta
     * @param cantidad Cantidad de dinero a ingresar
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Con este método se retira el dinero de la cuenta
     * @param cantidad Cantidad de dinero a retirar
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

