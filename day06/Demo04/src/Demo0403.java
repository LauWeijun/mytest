public class Demo0403 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand + "," + p.color + "," + p.price);
        p.brand = "小米";
        p.price = 2699;
        p.color = "黑";
        System.out.println(p.brand + "," + p.color + "," + p.price);
        p.call("黄章");
        p.sendMessage();
    }
}
