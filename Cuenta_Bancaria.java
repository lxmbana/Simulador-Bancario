/**
 * @author Andrés F. Lombana
 * @author Sergio L. Morillo
 * @version 1.0
 * @class Cuenta Bancaria
 * Clase que maneja la cuenta bancaria de un cliente
 * con los atributos de nombre, cedula, fecha actual y saldo total
 * asociacion de cuenta de ahorro, cuenta corriente y CDT
 */
package Simulador_Bancario;

public class Cuenta_Bancaria {

/**
* Atributos
*/
	
	private String nombre;
	private double cedula;
	private int fecha_actual;
	private double saldototal;

/**
 * Asociaciones
 */
	
private Cuenta_Bancaria cBancaria;
private Cuenta_Ahorro cAhorro;
private Cuenta_Corriente cCorriente;
private CDT cdt;

/**
 * Métodos
 */

/**
 * @method AvanzarMes
 * Método para avanzar mes a mes actualizando el saldo de las cuentas
 */
public void AvanzarMes() {

	double saldoCA = cAhorro.DarSaldoAhorro();
    double interesAhorro = saldoCA * 0.006;
    cAhorro.setSaldoCA(saldoCA + interesAhorro);
    
double saldoCC = cCorriente.DarSaldoCorriente();

double saldoCDT = 0.0;
double interesCDT = cdt.DarSaldoCDT() * (cdt.DarInteresMensual() /0.06);
saldoCDT = cdt.DarSaldoCDT() + interesCDT;

double saldototal = saldoCA + saldoCA + saldoCDT;

this.setSaldoTotal(saldototal);
}
/**
 * @method setSaldoTotal
 * Método para la función set del método anterior
 */
private void setSaldoTotal(double saldototal2) {
}
/**
 * @method CalcularSaldoTotal
 * Método para calcular el saldo total sumando todas sus cuentas
 * @return saldototal
 * Es la suma de todas las cuentas
 */
public double CalcularSaldoTotal() {
	double SaldoTotal = cAhorro.DarSaldoAhorro() + cCorriente.DarSaldoCorriente() + cdt.DarSaldoCDT();
	    return saldototal;
}
/**
 * @method RetirarTodo
 * Método para retirar todo el saldo total
 * @param saldototal
 * variable que resta el todo el saldo total
 */
public void RetirarTodo (double saldototal) {
	this.saldototal -= saldototal;
}

}