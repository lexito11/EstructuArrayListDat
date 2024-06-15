import java.util.ArrayList;

public class EstrucDatosArrayList {

	public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        System.out.println("Nombres en la lista:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    
		
	}

}
