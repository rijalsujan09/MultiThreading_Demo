public class MyThread implements Runnable{

String name;

MyThread(String name){
        this.name=name;
    }
public void run(){
    System.out.println("name = "+this.name+" -starded");
   try{
     for(int i=1; i<=5; i++){
        System.out.println("this is " +this.name+" = "+ i);
        Thread.sleep(500);
    }
   }catch(InterruptedException ex){
        System.out.println(ex.getMessage());
    }
    System.out.println("name = "+this.name+ " -stopped");
   }

       public static void main(String args[]){
        
        MyThread t = new MyThread("Thread A");
        Thread th1 = new Thread(t);
        th1.start();
    }
    
 
}