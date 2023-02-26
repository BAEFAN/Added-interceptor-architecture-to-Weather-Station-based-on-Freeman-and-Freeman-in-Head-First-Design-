package Interceptor;

import Appilcation.Observer;

import java.util.List;

public interface DispatcherObserver {
    //注册拦截 register interceptor
    public void registerInterceptor(Interceptor interceptor);
    //移除拦截 remove interceptor
    public void removeInterceptor(Interceptor interceptor);
    //将需要拦截的行为存储到集合中 Store the behavior that needs to be intercepted into a collection
    public List<Interceptor> interceptorList();
}
