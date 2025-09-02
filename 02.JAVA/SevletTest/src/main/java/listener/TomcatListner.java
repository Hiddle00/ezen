package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TomcatListner implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("톰캣 실행!");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("톰캣 종료!");
	}
}
