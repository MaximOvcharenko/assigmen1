package tools;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public final class QuickServer 
{
	private static int count = 0;
    public static final void main(final  String[] args ) throws IOException
    {
		final HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new HttpHandler()
        			{
						@Override
						public final void handle(final HttpExchange exchange) throws IOException 
						{
				            final String response = "<h1> Welcome! This page was called "+ (++count)+" times </h1>.<h2>This button does nothing: <button type=\"button\" onclick=\"alert('I do nothing!')\">Click Me!</button> </h2>";
				            exchange.sendResponseHeaders(200, response.length());
				            final OutputStream os = exchange.getResponseBody();
				            os.write(response.getBytes());
				            os.close();
						}
        			}
        		);
        server.setExecutor(null); // creates a default executor
        server.start();
    }//main(...) method closes
}//class QuickServer closes