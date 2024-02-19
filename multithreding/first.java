class Alpha implements Runnable{
 Alpha(){
 Thread t = new Thread(this, "New Child Thread");
 t.start();
 }
 public void run(){
 System.out.println("This is Run Method");
 try {
 for(int i = 5; i > 0; i--) {
 System.out.println("Child Thread: " + i);
 Thread.sleep(1000);
 } } catch (InterruptedException e) {
 System.out.println("Child interrupted.");
 } System.out.println("Exiting child thread.");
 } }
class first{
 public static void main(String[] args){
 Alpha a = new Alpha();
 a.run();
 }
}