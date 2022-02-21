package Assignment_02_20;
/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Use a switch statement to determine the message from the status value. Use the following chart to determine the results:
Status Codes

200: OK
201: Created
202: Accepted
307: Temporary Redirect
400: Bad Request
401: Unauthorized
403: Forbidden
404: Not Found
410: Gone
500: Internal Server Error
303: Service Unavailable
Any other number should output: Invalid status code

Main topics: switch statements, primitive variables
Example Flows:
  Enter status code:
  200
  OK
  Enter status code:
  400
  Unauthorized
  Enter status code:
  999
  Invalid status code
 */
import java.util.*;
public class HTTPstatusCodes {
  public static void main(String[] args) {
    //DO NOT TOUCH BELOW
    System.out.println("Enter status code:");
    Scanner scan = new Scanner (System.in);
    int status = scan.nextInt();

    //WRITE YOUR CODE BELOW:
      String description;
      switch (status){
          case 200:
              description = "OK";
              break;
          case 201:
              description = "Created";
              break;
          case 202:
              description = "Accepted";
              break;
          case 307:
              description = "Temporary Redirect";
              break;
          case 400:
              description = "Bad Request";
              break;
          case 401:
              description = "Unauthorized";
              break;
          case 403:
              description = "Forbidden";
              break;
          case 404:
              description = "Not Found";
              break;
          case 410:
              description = "Gone";
              break;
          case 500:
              description = "Internal Server Error";
              break;
          case 303:
              description = "Service Unavailable";
              break;
          default:
              description = "Invalid status code";
      }
      System.out.println(description);
  }
}
