
public class Print5thTable extends Thread {
	MultiplicationTable t;
	public Print5thTable(MultiplicationTable t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}

}
