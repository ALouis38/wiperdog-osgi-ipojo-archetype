/**
 * iPOJO sample service provider.
 * REMOVE THIS CLASS AS SOON AS YOU UNDERSTOOD WHAT THIS FILE GOING TO DO.
 */
package ${package}.internal;

import ${package}.SampleIntf;

import org.osgi.service.log.LogService;

public class SampleProviderImpl implements SampleIntf {

	private LogService logS;
	
	public String sayHello() {
		return "Hello";
	}

}
