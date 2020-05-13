/**
 * 
 * @author <b>Aprile</b> Alessio
 * Data: <i>13/05/20</i>
 * Classe: <u>4AI</u>
 *
 */
public class AprileClass {
	public int b;
	public int e;
/**
 * 	
 * @param b
 * @param e
 */
	public AprileClass(int b, int e) {
		this.b = b;
		this.e = e;
	}
	/**
	 * Il metodo cognomeMet
	 * @param b
	 * @param e
	 * @return
	 */
	public float cognomeMet (int b, int e) {
		int val1=1; 		
			for (int i=1; i<=b; i++){
				val1 = val1 * b;
			}
			return val1;
		}
	/**
	 * Con il metodo main testo il metodo cognomeMet
	 * @param args
	 */
	public static void main(String[] args) {
		AprileClass t= new AprileClass(10, 20);
        System.out.println(t.cognomeMet(10, 20));

	}

}
