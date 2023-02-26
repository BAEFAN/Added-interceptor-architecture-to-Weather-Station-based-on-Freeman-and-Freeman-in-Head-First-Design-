package Interceptor;

//定义上下文对象，用来传递系统参数。Define the context object, used to pass system parameters.
public class ContextObject {

    private String value;

    //设置系统变量set system variables
    public void setValue(String value) {
        this.value = value;
    }

    //获取系统变量Obtain system variable
    public String getValue() {
        return value;
    }

    //执行系统方法Execution System Method
    //打印日志
    public void service(){
        System.out.println("Print Log");
    };
}
