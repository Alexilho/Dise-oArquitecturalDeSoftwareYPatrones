public class Client{
    public static void main(String [] args){
        new Thread(){
            @Override
            public void run(){
                FileLogger.getFileLogger().log("Mensaje A");
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                FileLogger.getFileLogger().log("Mensaje B");
            }
        }.start();
    }
    
}