package edu.eci.arep.app;

import static spark.Spark.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Collatz {
    public static void main(String... args){
        secure("keystore/ecikeystore.p12", "123456", null, null);
        port(getPort());
        staticFiles.location("/public");
        get("/", (req,res) -> {
            res.redirect("index.html");
            return null;
        });
        get("/logged_in", (req, res) -> {
            res.redirect("logged_in.html");
            return null;
        });
    }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 42000;
  }
  
}
