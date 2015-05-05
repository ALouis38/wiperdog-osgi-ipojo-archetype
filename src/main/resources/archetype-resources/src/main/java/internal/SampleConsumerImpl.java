/**
 * iPOJO sample service consumer.
 * REMOVE THIS CLASS AS SOON AS YOU UNDERSTOOD WHAT THIS FILE GOING TO DO.
 */
package ${package}.internal;

import org.osgi.service.log.LogService;

import ${package}.SampleIntf;

public class SampleConsumerImpl {
	
	
	private LogService logS;
	
	private SampleIntf svc;
	void setService(SampleIntf service) {
		System.out.println("Got service");
		svc = service;
	}
	void clearService() {
		svc = null;
	}
	void start() {
		// do something
		System.out.println("started");
	}
	void stop() {
		// do something
		System.out.println("stopped");
	}
}
