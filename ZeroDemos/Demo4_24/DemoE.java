package ZeroDemos.Demo4_24;

public class DemoE<MVP> {
    // 没有MVP类型，在这里即代表 未知的一种数据类型，未来传递什么就是什么类型
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
