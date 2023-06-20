
public class MultiplicationTable {
	public synchronized void printTable(int n) {
		try {
			for(int i=1;i<=12;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
			Thread.sleep(200);
			}
		}
		catch(Exception e) {}
	}

}