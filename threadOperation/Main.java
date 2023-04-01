class Main{
    public static void main(String args[]){
        Company comp = new Company();
        Producer pr = new Producer(comp);
        Consumer cm = new Consumer(comp);
        pr.start();
        cm.start();
    }
}