public class Phone {
    // 属性:品牌,价格,颜色
    public String brand;
    public int price;
    public String color;

    // 行为:打电话,发短信
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
