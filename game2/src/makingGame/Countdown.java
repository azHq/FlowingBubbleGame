package makingGame;

class Countdown implements Runnable{
    public void run(){
    long time=System.currentTimeMillis();       
    long future=time+4*1000;            //2 seconds countdown time
    while(time<future){time=System.currentTimeMillis();}
    
    }
}
