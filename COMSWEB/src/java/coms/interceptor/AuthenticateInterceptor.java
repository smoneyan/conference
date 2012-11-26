package coms.interceptor;

import java.util.Map;
import java.util.logging.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


public class AuthenticateInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6821708564421448025L;
	private static final Logger LOG = Logger.getLogger(AuthenticateInterceptor.class.getName());

	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		LOG.info("\nEnter doIntercept");
		Action action = (Action) actionInvocation.getAction();
		Map<String, Object> map = actionInvocation.getInvocationContext().getSession();
		// Set the cart from the session and set it
		
		LOG.info("\nAuthenticateInterceptor calling: " + action.getClass().getName());
		return actionInvocation.invoke();
	}

}
