public class Company {
    int n;
    boolean b = false;
    synchronized public void produce_item(int n){
        if(b){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("Produced : "+ this.n);
        b=true;
        notify();
    }

    synchronized public int consume_item(){
        if(!b){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed : "+this.n);
        b= false;
        notify();
        return this.n;
    }
}