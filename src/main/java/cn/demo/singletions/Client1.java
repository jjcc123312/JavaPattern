package cn.demo.singletions;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * Create by Jjcc on 2019/6/30 15:25
 *
 * @author Jjcc
 */
public class Client1 {

    public static void main(String[] args){
        int threadNum = 10;
        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(threadNum);
        //线程计数器
        final CountDownLatch cdl = new CountDownLatch(threadNum);

        //开始时间
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            service.submit(new Test2(cdl));
        }

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("need: " + (end-begin));

        service.shutdown();
    }
}

class Test2 implements Runnable {
    CountDownLatch cdl;

    public Test2(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            for (int n = 0; n < 1000000; n++) {
                SingletonDemo5 instance = SingletonDemo5.INSTANCE;
//                instance.getMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //计数减1
            cdl.countDown();
        }
    }
}
