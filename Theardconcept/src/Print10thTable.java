
public class Print10thTable extends Thread {
		MultiplicationTable t;
		
		public Print10thTable(MultiplicationTable t) {
			this.t = t;
		}
		public void run() {
			t.printTable(10);
		}
	}

