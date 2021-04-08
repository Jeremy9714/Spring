package bean;

/**
 * @author Chenyang
 * @create 2021-04-08-15:59
 */
public class Orders {

    private String name;

    public Orders() {
        System.out.println("第一步，构造器创建bean对象");
    }

    public void setName(String name) {
        System.out.println("第二步，设置bean的属性值");
        this.name = name;
    }

    public void init(){
        System.out.println("第三步，执行bean的初始化方法");
    }

    public void destory(){
        System.out.println("第五步，执行bean的销毁方法");
    }
}
