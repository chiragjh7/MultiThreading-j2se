public class ThreadDemo5 {

	public static void main(String[] args) throws Exception {
		

		Thread t1 = new Thread(() -> 
		{	for(int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
		
	}, "Hi Thread");
		Thread t2 = new Thread(() -> {
			 
				for(int i = 0; i < 5; i++) {
					System.out.println("Hello");
					try { Thread.sleep(1000); } catch(Exception e) {}
					
				}
			}, "Hello Thread");
		
//		t1.setName("Hi Thread");
//		t2.setName("Hi Thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		
		System.out.println("bye");
		
	}
}
