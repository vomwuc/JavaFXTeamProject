//package rest;
//
//
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//
//public class Requests {
//
//    public void get(String uri, String data) throws Exception {
//        HttpClient client = HttpClient.newBuilder().build();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("localhost:8500/linor"))
//                .POST(HttpRequest.BodyPublishers.ofString(data))
//                .build();
//    }
//}
