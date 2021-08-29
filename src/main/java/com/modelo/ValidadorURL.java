package com.modelo;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
/**
 *
 * @author camil
 */
public class ValidadorURL {
    public ValidadorURL(){
        
    }
    public static boolean urlValidador(String url) throws IOException
    {
        /*validación de url*/
        try {
            new URL(url).openStream().close();
            return true;
        }
        catch (MalformedURLException exception) {
            return false;
        }
    }

    public static void main(String[] args)
    {
        String url = "https://www.javadesdecero.es/";

        /* validar la url */
        /*if (urlValidador(url))
            System.out.print("La url dada " + url + " es válida");
        else
            System.out.print("La url dada " + url + " no es válida");
    }*/
    }
}
