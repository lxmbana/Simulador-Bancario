/**
 * @author Andrés F. Lombana
 * @author Sergio L. Morillo
 * @version 1.0
 * @class Cuenta Corriente
 * Clase que maneja la cuenta corriente de un cliente
 * con el atributo de saldo de la cuenta corriente.
 */
package Simulador_Bancario;

public class Cuenta_Corriente {
	
/**
* Atributos
*/
private double saldoCC;

/**
 * Métodos
 */

/**
 * @Method DarSaldoCorriente
 * Metodo para retornar el saldo de la cuenta corriente
 * @return return this.saldoCC;
 * Metodo para retornar el saldo de la cuenta corriente
 * */
public double DarSaldoCorriente() {
	return this.saldoCC;
}
/**
 * @Method Consignar
 * metodo para consignar a la cuenta corriente
 *  * @param monto
 * Es la variable que se suma al saldo de la cuenta corriente
 */
public void Consignar(double monto) {
    this.saldoCC += monto;
}
/**
 * @Method Retirar
 * metodo para retirar de la cuenta corriente
 *  * @param monto
 * Es la variable que se resta al saldo de la cuenta corriente
 */
public void Retirar (double monto) {
    this.saldoCC -= monto;
}
/**
 * @method transferir
 * Método de transferencia para la asociacion con CDT 
 */
public void transferir(double saldoCDT) {	
}

}