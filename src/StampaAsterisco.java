public class StampaAsterisco implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.getStackTrace();
            };
        }
    }
}
