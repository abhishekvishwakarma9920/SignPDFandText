package in.cryptofocus.dev.erobotdemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Server_connection {

	public Server_connection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String executePost(String targetURL, String workerName, String VISIBLE_SIGNATURE_PAGE,
			String VISIBLE_SIGNATURE_RECTANGLE, String SIGNATURE_VISIBLE_TYPE, String REASON, String LOCATION,
			String TSA_URL, String DIGESTALGORITHM,String PDF_FILE) {                               //,String PDF_file
		HttpURLConnection connection = null;

		try {
			// Create connection
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			connection.setRequestProperty("Content-Length", Integer.toString(workerName.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length", Integer.toString(VISIBLE_SIGNATURE_PAGE.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length",
					Integer.toString(VISIBLE_SIGNATURE_RECTANGLE.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length", Integer.toString(SIGNATURE_VISIBLE_TYPE.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length", Integer.toString(REASON.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length", Integer.toString(LOCATION.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length", Integer.toString(TSA_URL.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setRequestProperty("Content-Length", Integer.toString(DIGESTALGORITHM.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");
			
			
			  connection.setRequestProperty("Content-Length",
			  Integer.toString(PDF_FILE.getBytes().length));
			 connection.setRequestProperty("Content-Language", "en-US");
			 


			connection.setUseCaches(false);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(workerName);
			wr.writeBytes(VISIBLE_SIGNATURE_PAGE);
			wr.writeBytes(VISIBLE_SIGNATURE_RECTANGLE);
			wr.writeBytes(SIGNATURE_VISIBLE_TYPE);
			wr.writeBytes(REASON);
			wr.writeBytes(LOCATION);
			wr.writeBytes(TSA_URL);
			wr.writeBytes(DIGESTALGORITHM);
			wr.writeBytes(PDF_FILE);
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
}
