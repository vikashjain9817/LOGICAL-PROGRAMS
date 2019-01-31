package multithreading;

class TestCallRun2 extends Thread{  
	 public void run(){  
		 String s1 ="first";
		 String s2 ="second";
		 String s3 ="third";
	  for(int i=1;i<=15;i++){  
		  String s4 = this.getName();
		  if(s4.equals(s1) && i <= 5)
			  System.out.println("first "+i);  
		  if(s4.equals(s2) && i >5 && i <= 10)
			  System.out.println("second "+i);
		  if(s4.equals(s3) && i >10 && i <= 15)
			  System.out.println("third "+i);
	  }  
	 }  
	 public static void main(String args[]){  
	  TestCallRun2 t1=new TestCallRun2();  
	  TestCallRun2 t2=new TestCallRun2();  
	  TestCallRun2 t3=new TestCallRun2();  
	  t1.setName("first");
	  t2.setName("second");
	  t3.setName("third");
	  t1.run();  
	  t2.run();  
	  t3.run();
	 }  
	}  
