package in.cryptofocus.dev.erobotdemo;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping("/")
	public String test() {
		return "page";
	}

	@RequestMapping(path = "/ProcessForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute GetterAndSetter gs, Model model) {

		Server_connection server = new Server_connection();

		String reply = server.executePost(
				"https://ab0b838e-f62a-41f9-b16b-85a1ec0441d9.mock.pstmn.io/rest/signserver/signPdf",
				gs.getWorkerName(), gs.getVISIBLE_SIGNATURE_PAGE(), gs.getVISIBLE_SIGNATURE_RECTANGLE(),
				gs.getSIGNATURE_VISIBLE_TYPE(), gs.getREASON(), gs.getLOCATION(), gs.getTSA_URL(),
				gs.getDIGESTALGORITHM(), gs.getPDF_FILE()); // ,gs.getPdf_file()

		model.addAttribute("Reply", gs);
		gs.setReply(reply);

		File file = new File("src/main/webapp/data1.txt");

	//	String data = "Hello World!\nWelcome to www.tutorialkart.com";

		try (FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			// convert string to byte array
			byte[] bytes = reply.getBytes();
			// write byte array to file
			bos.write(bytes);
			bos.close();
			fos.close();
			System.out.print("Data written to file successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "ProcessForm";
	}
}
