package com;

public class SynThread implements Runnable {
    private int goodsCount = 5; //库存商品数量
    public SynThread(int goodsCount)
    {
        this.goodsCount = goodsCount;
    }

//    public synchronized void saleGoods() //使用synchronized关键字同步方法 -方法1
    public void saleGoods()
    {
        synchronized (this) //使用synchronized关键字同步方法 -方法2
        {
            if(goodsCount > 0)
            {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + (5-goodsCount+1) + "个商品,还剩余" + (--goodsCount) + "个商品");
            }
            else
            {
                System.out.println("商品已售罄");
            }
        }
    }

    public void run()
    {
        while (goodsCount > 0)
        {
            saleGoods();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SynThread synThread = new SynThread(5);
        Thread t1 = new Thread(synThread,"张三");
        Thread t2 = new Thread(synThread,"李四");
        t1.start();
        t2.start();
    }
}
