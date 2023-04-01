public class ThreadMain{
    public static void main(String args[]){
        ThreadA ta = new ThreadA();
        Thread th = new Thread(ta);
        th.start();

        ThreadB tb = new ThreadB();
        tb.start();
    }
    
}