package Day5;

/**
 * @ClassName TestGraph
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/24
 **/

public class TestGraph {
    public static void main(String[] args) {
        //先分别用子类直接创建对象并赋值给子类
        Circle circle =new Circle(2);
        System.out.println(circle.getCircumference());

        System.out.println("************************");
        Rectangle rect = new Rectangle(2,3);
        System.out.println(rect.getCircumference());

        System.out.println("***************************");
        //用上转型对象，这样graph可以接受Circle的对象，也可以接受Rectangle的对象，体现了多台
        BaseGraph graph =new Circle(2);
        System.out.println(graph.getCircumference());
        graph = new Rectangle(2,3);
        System.out.println(graph.getCircumference());
    }
}
