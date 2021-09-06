class MainClass
{
    public static void main(String[] args) {
        System.out.println("Hi");
        Company comp=new Company();
        Producer p=new Producer(comp);
        Consumer c=new Consumer(comp);
        p.start();
        c.start();

    }
}