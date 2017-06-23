package com.test.dropwizpoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.dropwizpoc.rest.controller.EmployeeRESTController;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class App extends Application<Configuration>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
			new App().run(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public void run(Configuration config, Environment env) throws Exception {
		LOGGER.info("Registering REST resources");
		env.jersey().register(new EmployeeRESTController(env.getValidator()));
	}
}
