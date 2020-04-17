package com.automation.tests;


import com.automation.pojos.Status;
import com.automation.pojos.Store;
import com.automation.utilities.ConfigurationReader;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static io.restassured.RestAssured.*;


import static io.restassured.RestAssured.baseURI;
/*
API TestCase to automate :

1) Access below API
https://istheapplestoredown.com/api/v1/status/worldwide
2) API will return JSON response.
3) Parse the JSON
4) Check if response has "status": "y"
Fail the test and display the name of the country.

- Simple Maven Project
- Java
- Any Framework is fine
 */


public class tc1 {
    @BeforeMethod
    public static void setup() {
        baseURI = ConfigurationReader.getProperty("baseURI");
    }

    @Test
    public static void status_check() {
        Response response = given().
                accept("application/json").
                get();


        String str = response.jsonPath().getString("ae.status");
        //System.out.println(str);


        //Store store =new Gson().fromJson(str,Status.class)

        String res = response.asString();



        Store store = new Gson().fromJson(res,Store.class);
        Store store2 = new Store();









    }
}
