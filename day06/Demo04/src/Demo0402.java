public class Demo0402 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand + "," + p.color + "," + p.price);
        p.brand = "魅族";
        p.price = 2799;
        p.color = "深空灰";
        System.out.println(p.brand + "," + p.color + "," + p.price);
        p.call("雷军");
        p.sendMessage();
    }
}
