package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker

        Client tmpClient = new Client("sensor", "localhost", 8080);

        tmpClient.connect();


        for (int i = 0; i < COUNT; i++) {
            String snR = String.valueOf(sn.read());
            tmpClient.publish("temperature", snR);
        }
        tmpClient.disconnect();

		// TODO - end

		System.out.println("Temperature device stopping ... ");



	}
}
