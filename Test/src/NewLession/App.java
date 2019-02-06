package NewLession;
class Machine{
	private String name;
	private int code;
	private Double grade;

	public Machine() {
		
		System.out.println("First Constructor running!");
	}
	public Machine(String name) {
		
		System.out.println("Second Constructor running!");
	}
	public Machine(String name,int code) {
		System.out.println("Third Constructor running!");
	}
	public Machine(String name,Double grade,int code) {
		this();
		System.out.println("Fourth Constructor running!");
	}	
}
public class App {

	public static void main(String[] args) {
		new Machine();
		Machine machine2 = new Machine("James");
		Machine machine3 = new Machine("KOLA", 20);
		Machine machine4 = new Machine("Bello",3.5, 20);
	}

}
