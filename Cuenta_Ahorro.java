/**
 * @author Andrés F. Lombana
 * @author Sergio L. Morillo
 * @version 1.0
 * @class Cuenta Ahorro
 * Clase que maneja la cuenta de ahorros de un cliente
 * con el atributo de saldo de la cuenta de ahorros.
 */
package Simulador_Bancario;

public class Cuenta_Ahorro {
	
/**
* Atributos
*/
private double saldoCA;

/**
 * Métodos
 */

/**
 * @Method DarSaldoAhorro
 * Metodo para retornar el saldo de la cuenta de ahorro
 * @return return this.saldoCA;
 * Metodo para retornar el saldo de la cuenta de ahorro
 * */
public double DarSaldoAhorro() {
	return this.saldoCA;
}
/**
 * @Method Consignar
 * metodo para consignar a la cuenta de ahorros
 *  * @param monto
 * Es la variable que se suma al saldo de la cuenta de ahorros
 */
public void Consignar (double monto) {
    this.saldoCA += monto;
}
/**
 * @Method Retirar
 * metodo para retirar de la cuenta de ahorros
 *  * @param monto
 * Es la variable que se resta al saldo de la cuenta de ahorros
 */
public void Retirar (double monto) {
    this.saldoCA -= monto;
}
/**
 * @Method DuplicarAhorro
 * Metodo para duplicar el saldo de la cuenta de ahorros
 */
public void DuplicarAhorro () {
	this.saldoCA*=2;
}
/**
* @Method CalcularIntereses
* Calcula el interes al saldo de la cuenta de ahorros
* @return calculo del interes.
*/
public double CalcularIntereses() {
    double intereses = this.saldoCA * 0.006;
    this.saldoCA += intereses;
    return intereses;
}
/**
 * @method transferir
 * Metodo de transferencia para la asociacion con CDT
 */
public void transferir(double saldoCDT) {
}
/**
 * @method setSaldoCA
 * Método en ésta clase para la función set de el metodo AvanzarMes
 * @param d
 * variable para aclarar el saldo de la cuenta de ahorros en el metodo AvanzarMes
 */
public void setSaldoCA(double d) {
}

}