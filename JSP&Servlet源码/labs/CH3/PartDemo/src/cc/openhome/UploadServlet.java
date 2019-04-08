package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

// 完成标号1内容
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    // 完成标号2内容
		String filename = getFilename(part);
		writeTo(filename, part);
	}

	private String getFilename(Part part) {
	 // 完成标号3内容
	}
	
	private void writeTo(String filename, Part part) throws IOException,
			FileNotFoundException {
		InputStream in = part.getInputStream();
		OutputStream out = new FileOutputStream("c:/workspace/" + filename);
		byte[] buffer = new byte[1024];
		int length = -1;
		while ((length = in.read(buffer)) != -1) {
			out.write(buffer, 0, length);
		}
		in.close();
		out.close();
	}
}
