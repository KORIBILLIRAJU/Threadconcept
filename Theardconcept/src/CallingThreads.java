
public class CallingThreads {
	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		Thread t1 = new Print5thTable(table);
		Thread t2 = new Print10thTable(table);
		
		t1.start();
		t2.start();
	}

}
