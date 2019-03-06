
public class EmpleadosMain {

	public static void main(String[] args) {
		
		Empleados1 Antonio=new Empleados1(1,"Antonio","Pérez","C/Laurel 2", 652147474);
		System.out.println("El empleado: " +Antonio.getId()+ " se llama " +Antonio.getNombre()+ " " +Antonio.getApellidos() +" su dirección es: " +Antonio.getDirección() +" Y su número de teléfono: " +Antonio.getTeléfono());
		
		
		Empleados1 Laura=new Empleados1(2, "Laura","Montiel","C/Oliva 5", 626547744);
		System.out.println("El empleado: " +Laura.getId()+ " se llama " +Laura.getNombre()+ " " +Laura.getApellidos() +" su dirección es: " +Laura.getDirección() +" Y su número de teléfono: " +Laura.getTeléfono());
	}

}
