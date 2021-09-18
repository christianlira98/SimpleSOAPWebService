package br.ufrpe.dc.soa;

import javax.xml.ws.Endpoint;

public class DateDaysDurationServerPublisher {

    public static void main (String[] args) {
        Endpoint.publish("http://127.0.0.1:9090/soa.dc.ufrpe.br", new DateDaysDurationServerImplementation());
    }
}
