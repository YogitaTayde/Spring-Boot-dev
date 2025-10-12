
public class Overriding {
	public static void main(String[] args) {
		Teachers t=new Teachers();
		t.name();
	}

}
class Teacher{
	public void name() {
		System.out.println("show all teacher name");
	}
}
class Teachers extends  Teacher{
	public void name() {
		System.out.println("ajay,vijay,akshay");
	}
}