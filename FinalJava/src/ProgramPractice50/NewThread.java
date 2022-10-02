package ProgramPractice50;

public class NewThread implements Runnable {
	public static void main(String[] args) {
		NewThread aNewThread0=new NewThread();
		NewThread aNewThread1=new NewThread();
		NewThread aNewThread2=new NewThread();
		NewThread aNewThread3=new NewThread();
		NewThread aNewThread4=new NewThread();
		NewThread aNewThread5=new NewThread();
		NewThread aNewThread6=new NewThread();
		NewThread aNewThread7=new NewThread();
		aNewThread1.run();
		
		
	}

	@Override
	public void run() {
		System.out.println("Its a thread 1");
	}
	
}
