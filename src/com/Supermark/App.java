package com.Supermark;

import static spark.Spark.*;
import org.apache.log4j.PropertyConfigurator;
import com.google.gson.Gson;

public class App {
	 public static void main(String[]args){
		   String log4jConfPath = "C:/Users/enzzo/eclipse-workspace/Curso_Java/cinemar/to/log4j.properties"; //change it boy
		   PropertyConfigurator.configure(log4jConfPath);
	       Gson mapper= new Gson();
	       // port(8080);
	       get("/saludo", (req,res) -> new Persona("Gabriel","Silvestre"), mapper::toJson); //don't use the class Persona use another one
	   }