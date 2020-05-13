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
 */
	
	public AprileClass() {
	// TODO Auto-generated constructor stub
}
	/**
	 * Il metodo cognomeMet
	 * @param b
	 * @param e
	 * @return
	 */
	public float aprileMet (int b, int e) {
	    int val1=b;
	    
	      for (int i=1; i<e; i++){
	        val1 = val1 * b;
	      }
	      return val1;
	      
	    }
	//Ho sostituito i<=b con i<e
	/**
	 * Con il metodo main testo il metodo cognomeMet
	 * @param args
	 */
	public static void main(String[] args) {
		AprileClass t= new AprileClass();
        System.out.println(t.aprileMet(10, 20));

	}

}
