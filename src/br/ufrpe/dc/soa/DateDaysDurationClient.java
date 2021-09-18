package br.ufrpe.dc.soa;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class DateDaysDurationClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1:9090/soa.dc.ufrpe.br?wsdl");
        QName qName = new QName("http://soa.dc.ufrpe.br/", "DateDaysDurationServerImplementationService");
        Service ws = Service.create(url, qName);
        DateDaysDurationServer calc = ws.getPort(DateDaysDurationServer.class);

        String date1 = "2021-12-31";
        String date2 = "2022-01-05";

        System.out.println(calc.daysBetweenDates(date2, date1));

    }
}
