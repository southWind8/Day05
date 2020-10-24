package Day5;

/**
 * @ClassName Circle  类继承Graph
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/24
 **/

public class Circle extends BaseGraph {
    private final double r ;
    public Circle(double r){
        super();
        this.r=r;
    }
    @Override
    public double getCircumference() {
        return 2*r*Math.PI;
    }
}
