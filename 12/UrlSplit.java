import java.util.Scanner;
public class UrlSplit{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter url:");
        String url= sc.nextLine();

        String protocol=null;
        String domain=null;
        String port=null;
        String path=null;

        if(url.contains("://")){
            protocol= url.substring(0,url.indexOf("://"));
            url=url.substring(url.indexOf("://")+3);
        }


        if(url.contains("/")){
            path=url.substring(url.indexOf("/")+1);
            url= url.substring(0,url.indexOf("/"));
           
        }

        if(url.contains(":")){
            port= url.substring(url.indexOf(":")+1);
            domain=url.substring(0,url.indexOf(":"));

        }
        else{
            domain=url;
        }

         System.out.println("protocol: "+protocol);
         System.out.println("domain: "+domain);
         System.out.println("port: "+port);
         System.out.println("path: "+path);
    }
}