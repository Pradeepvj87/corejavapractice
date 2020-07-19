import org.prac.Study;

public class Revise extends Study {
public Revise() {
	super (90);
	System.out.println("Default constructor");
	
}
public Revise(int id) {
	System.out.println("int para constructor");
	System.out.println(id);
}
public static void main(String[] args) {
	Revise d = new Revise();
	Revise f = new Revise(100);
}




}








