package in.cryptofocus.dev.erobotdemo;

public class GetterAndSetter {

	private String workerName;
	private int VISIBLE_SIGNATURE_PAGE;
	private String VISIBLE_SIGNATURE_RECTANGLE;
    private String REASON;
	private String LOCATION;
	private String TSA_URL;
	private static String Reply;
    private String PDF_FILE;

	public String getPDF_FILE() {
		return PDF_FILE;
	}

	public void setPDF_FILE(String pDF_FILE) {
		PDF_FILE = pDF_FILE;
	}

	public static String getReply() {
		if (Reply.isEmpty() )
			return "error";
		else 
			return Reply;
	}

	public void setReply(String reply) {
		Reply = reply;
	}

	public String getWorkerName() {
		if (workerName.isEmpty())
			return "CapricornTestDSC_PDFWorker";
		else
			return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getVISIBLE_SIGNATURE_PAGE() {
		String s = String.valueOf(VISIBLE_SIGNATURE_PAGE);
		return s;
	}

	public void setVISIBLE_SIGNATURE_PAGE(int vISIBLE_SIGNATURE_PAGE) {
		VISIBLE_SIGNATURE_PAGE = vISIBLE_SIGNATURE_PAGE;
	}

	public String getVISIBLE_SIGNATURE_RECTANGLE() {
		if (VISIBLE_SIGNATURE_RECTANGLE.isEmpty())
			return "20,20,300,150";
		else
			return VISIBLE_SIGNATURE_RECTANGLE;
	}

	public void setVISIBLE_SIGNATURE_RECTANGLE(String vISIBLE_SIGNATURE_RECTANGLE) {
		VISIBLE_SIGNATURE_RECTANGLE = vISIBLE_SIGNATURE_RECTANGLE;
	}

	public String getSIGNATURE_VISIBLE_TYPE() {
		return "TEXT_WITH_LOGO_LEFT";
	}

	public void setSIGNATURE_VISIBLE_TYPE(String sIGNATURE_VISIBLE_TYPE) {
		String SIGNATURE_VISIBLE_TYPE = sIGNATURE_VISIBLE_TYPE;
	}

	public String getREASON() {
		return REASON;
	}

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

	public String getLOCATION() {
		return LOCATION;
	}

	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}

	public String getTSA_URL() {
		if (TSA_URL.isEmpty())
			return "http://timestamp.digicert.com";
		else
			return TSA_URL;
	}

	public void setTSA_URL(String tSA_URL) {
		TSA_URL = tSA_URL;
	}

	public String getDIGESTALGORITHM() {
		return "SHA256";
	}

	public void setDIGESTALGORITHM(String dIGESTALGORITHM) {
		String DIGESTALGORITHM = dIGESTALGORITHM;
	}

}