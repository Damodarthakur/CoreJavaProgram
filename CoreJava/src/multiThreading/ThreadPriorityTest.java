package multiThreading;




class Mythreadd extends Thread{
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
		
	}
	
}

public class ThreadPriorityTest {
	
	public static void main(String[] args) {
		
		Mythreadd t = new Mythreadd();
		
		t.setPriority(10);
		
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
			
		}
				
	}

}

