class ThreadOp {
    public static void main(String [] args){
        System.out.println("programme started...");
        int x = 56+34;
        System.out.println("sum is "+ x);
        Thread t = Thread.currentThread();
        System.out.println("current running thread is "+t.getName());
        t.setName("myMain");
        try{
            Thread.sleep(4000);
        }catch(InterruptedException ex){

        }
        System.out.println("current running thread is "+t.getName());
        System.out.println("current running thread Id is "+t.getId());
        System.out.println("programme stopped...");
    }
}