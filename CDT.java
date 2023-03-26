/**
 * @author Andrés F. Lombana
 * @author Sergio L. Morillo
 * @version 1.0
 * @class CDT
 * Clase que maneja el certificado de depósito a término de un cliente
 * con los atributos de saldo del CDT y el Interes Mensual
 * asociacion de cuenta de ahorro y cuenta corriente
 */
package Simulador_Bancario;

public class CDT {
	
/**
* Atributos
*/
private double saldoCDT;
private double interesMensual;

/**
 * Métodos
 */

/**
 * @Method DarSaldoCDT
 * Metodo para retornar el saldo del CDT
 * @return return this.saldoCDT;
 * Metodo para retornar el saldo del CDT
 * */
public double DarSaldoCDT() {
	return this.saldoCDT;
}
/**
* @Method DarInteresMensual
* Método que calcula el interes mensual con la inversión que se realice
* @return calculo del interes mensual.
*/
public double DarInteresMensual (double CantidadInversion, double tasaInteres) {
	double DarinteresMensual = CantidadInversion * (tasaInteres / 12.0);
    return DarinteresMensual;
}
/**
 * @Method transferirSaldoCDT
 * Método para transferir el saldo del CDT a la cuenta de ahorros o a la cuenta corriente
 * Cuenta de Ahorro y Cuenta Corriente Asociadas
 * @param cdt
 * Es la variable para determinar la cuenta de la cual sale el dinero a transferir
 * @param cuentaAhorro
 * Es la variable para especificar a que cuenta va a ir la transferencia
 * @param cuentaCorriente
 * Es la otra variable para especificar a que cuenta va a ir la transferencia
 */
public void transferirSaldoCDT(CDT cdt, Cuenta_Ahorro cuentaAhorro, Cuenta_Corriente cuentaCorriente) {

	double SaldoCDT = this.saldoCDT;
	
    cuentaAhorro.transferir(saldoCDT);
    
    cuentaCorriente.transferir(saldoCDT);
/**
 * Variables para determinar que el cdt se cierra pero solo  cuando el saldo sea 0
 */
    cdt.setSaldo(0);
    cdt.setEstado("Cerrado");
}
/**
 * Métodos para definir las variables anteriores
 */
private void setSaldo(int i) {
}
private void setEstado(String string) {
}
/**
 * @method DarInteresMensual
 * Metodo de Dar Interes Mensual para la asociación con cuenta bancaria
 * @return 0
 * Retorna en 0
 */
public double DarInteresMensual() {
	return 0;
}

}