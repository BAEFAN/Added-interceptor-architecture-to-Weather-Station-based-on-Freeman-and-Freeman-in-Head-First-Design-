package Interceptor;

public class Application {

    private Dispatcher dispatcher;

    public void startBeforeInterceptor(){
        dispatcher = new Dispatcher();
        Interceptor playInterceptorBefore = dispatcher.setBeforeInterceptor(new MeasurementInterceptor());
        dispatcher.registerInterceptor(playInterceptorBefore);
        dispatcher.dispatch(new ContextObject());
    }
    public void startAfterInterceptor(){
        dispatcher = new Dispatcher();
        Interceptor stopInterceptorAfter = dispatcher.setAfterInterceptor(new MeasurementInterceptor());
        dispatcher.registerInterceptor(stopInterceptorAfter);
        dispatcher.dispatch(new ContextObject());
    }

    public static void removeInterceptor(){

    }
}
