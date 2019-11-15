package best.dima.sandbox.webservice;

import javax.xml.ws.Endpoint;
public class Starter {
    public static void main(String[] args) {
        String url = "http://localhost:1212/hello";
        Endpoint.publish(url, new Hello());
        System.out.println("Service started @ " + url);
    }
}