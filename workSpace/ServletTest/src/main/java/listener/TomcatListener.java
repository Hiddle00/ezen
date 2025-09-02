package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TomcatListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("톰캣실행!!");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("톰캣종료!!");
	}
}
