package day10_IfStatement;

public class protokol {
    public static void main(String[] args) {
        int statusCode = 404;
        String code = "";
        if (statusCode== 200){
            code = "OK";
        }else if (statusCode== 201){
            code = "Created";
        }else if (statusCode == 301){
            code ="Moved Permanently";
        }else if (statusCode== 304){
            code = "Temporary Redirect";
        }else if (statusCode== 400){
            code = "Bad Request";
        }else if (statusCode == 401){
            code ="Unauthorized";
        }else if (statusCode== 403){
            code = "Forbidden";
        }else if (statusCode== 404){
            code = "Not Found";
        }else if (statusCode == 410){
            code = "Gone";
        }else if (statusCode== 500){
            code = "Internal Server Error";
        }else if (statusCode == 503){
            code ="Service Unavailable";
        }
        System.out.println(code);
    }
}
