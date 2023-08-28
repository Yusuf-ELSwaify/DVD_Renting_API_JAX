package org.example.business.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.example.persistence.configurations.JpaManager;

public class ContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context initialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		JpaManager.close();
		System.out.println("closed");
	}
}
