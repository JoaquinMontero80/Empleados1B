
public class EmpleadosMain {

	public static void main(String[] args) {
		
		Empleados1 Antonio=new Empleados1(1,"Antonio","P�rez","C/Laurel 2", 652147474);
		System.out.println("El empleado: " +Antonio.getId()+ " se llama " +Antonio.getNombre()+ " " +Antonio.getApellidos() +" su direcci�n es: " +Antonio.getDirecci�n() +" Y su n�mero de tel�fono: " +Antonio.getTel�fono());
		
		
		Empleados1 Laura=new Empleados1(2, "Laura","Montiel","C/Oliva 5", 626547744);
		System.out.println("El empleado: " +Laura.getId()+ " se llama " +Laura.getNombre()+ " " +Laura.getApellidos() +" su direcci�n es: " +Laura.getDirecci�n() +" Y su n�mero de tel�fono: " +Laura.getTel�fono());
	}

}
