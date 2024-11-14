public class QResponse {
    private int flag = 1; // 抢答flag，默认值为1，表示还没有人抢答成功

    public synchronized void answer(String name) {
        if (flag == 1) {
            System.out.println(name + " 抢答成功！");
            flag = 0;
        } else {
            System.out.println(name + " 抢答失败！");
        }
    }
}