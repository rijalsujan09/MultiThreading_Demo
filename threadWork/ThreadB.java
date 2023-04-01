public class ThreadB extends Thread{
    

    public void run(){
        System.out.println("Thread B Started....");
        for(int i=5; i>=1; i--){
             try{
            Thread.sleep(5000);
           }catch(Exception ex){

           }
            System.out.println("Value of i is "+i);
          
           }
           System.out.println("Thread B Stopped....");
        }
    

    // public static void main(String args[]){
    //   ThreadB t1 = new ThreadB();
    //     t1.start();
    // }
}