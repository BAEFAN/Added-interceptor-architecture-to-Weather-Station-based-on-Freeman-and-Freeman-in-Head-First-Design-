package Interceptor;

public class MeasurementInterceptor implements Interceptor{

    @Override
    public void beforeMeasurementChanged(ContextObject contextObject) {
        MeasurementInterceptor.beforeMeasurementChanged();
    }

    @Override
    public void afterMeasurementChanged(ContextObject contextObject) {
        MeasurementInterceptor.afterMeasurementChanged();
    }

    public static void beforeMeasurementChanged(){
        System.out.println("Intercept before data change: check whether the changed weather data is valid");
    }//数据改变前拦截:校验发生改变的气象数据是否有效

    public static void afterMeasurementChanged(){
        System.out.println("Intercept after data change: record and count the changed data");
    }//数据改变后拦截:对改变后数据进行记录、统计等行为
}
