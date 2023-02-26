package Interceptor;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher implements DispatcherObserver{

    private List<Interceptor> interceptorList;

    private Interceptor beforeMeasurementInterceptor;
    private Interceptor afterMeasurementInterceptor;


    // 初始化 initialization
    public Dispatcher() {
        interceptorList = new ArrayList();
    }

    public Interceptor setBeforeInterceptor(Interceptor i){
        beforeMeasurementInterceptor = i;
        return beforeMeasurementInterceptor;
    }
    public Interceptor setAfterInterceptor(Interceptor i){
        afterMeasurementInterceptor = i;
        return afterMeasurementInterceptor;
    }

    @Override
    public void registerInterceptor(Interceptor interceptor) {
        interceptorList.add(interceptor);
    }

    @Override
    public void removeInterceptor(Interceptor interceptor) {
        int i = interceptorList.indexOf(interceptor);
        if (i >= 0) {
            interceptorList.remove(i);
        }
    }

    @Override
    public List<Interceptor> interceptorList() {
        return interceptorList;
    }

    public void dispatch(ContextObject contextObject){
        for(Interceptor i:interceptorList){
            if(i == beforeMeasurementInterceptor){
                i.beforeMeasurementChanged(contextObject);
            }
            if(i == afterMeasurementInterceptor){
                i.afterMeasurementChanged(contextObject);
            }
        }
    }
}
