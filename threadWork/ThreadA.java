public class ThreadA implements Runnable{
    // creating threads using runnable interface.

    // provoding task for thread
    public void run(){
        System.out.println("Thread A Started.....");
        for(int i=1; i<=5; i++){
            System.out.println("Value of i is "+ i);
            try{
                Thread.sleep(1000);
            }catch(Exception ex){

            }
        }
        System.out.println("Thread A Stopped....");
    }

    // public static void main(String args[]){
    //     ThreadA m1 = new ThreadA();
    //     Thread t1 = new Thread(m1);
    //     t1.start();
    // }

}