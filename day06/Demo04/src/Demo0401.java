public class Demo0401 {
    public static void main(String[] args) {
        // 2.创建对象: 类名 对象名 = new 类名();
       Phone p = new Phone();

        // 3.使用对象: 对象名.xxx
        System.out.println(p.brand + "," + p.price + "," + p.color);
        p.brand = "锤子";
        p.price = 1999;
        p.color = "棕色";
        System.out.println(p.brand + "," + p.price + "," + p.color);
        p.call("林青霞");
        p.sendMessage();
    }
}
