package test;

import javax.ws.rs.WebApplicationException;

import org.jboss.resteasy.core.ResourceMethodInvoker;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;
import org.jboss.resteasy.spi.metadata.ResourceMethod;

//@Provider
public class SecurityInterceptor implements PreProcessInterceptor{


	public ServerResponse preProcess(HttpRequest arg0, ResourceMethodInvoker arg1)
			throws Failure, WebApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
