package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class adviceAction implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("Around advice before");
		methodInvocation.proceed();
		System.out.println("Around advice after");
		return null;
	}


}
