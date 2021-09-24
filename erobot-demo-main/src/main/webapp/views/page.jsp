<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Details</title>
<style type="text/css">
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
div {
  background-color: white;
  width: 600px;
  border: 5px solid black;
  padding: 60px;
  margin: 5px;
}
</style>
</head>
<body>

    <div>
      <form action="/ProcessForm" method="post">

	<span class="workername">
	<b>WorkerName:</b><input type="text" name="workerName" />
	</span><br /><br />
		
		
	<span class="Visible_Signature_Page">
	<b>Visible Signature Page:</b><input type="text" name="VISIBLE_SIGNATURE_PAGE" />
	</span><br /><br />
		
		
		<span class="Visible_Signature_Rectangle">
		<b>Visible signature rectangle:</b><input type="text" name="VISIBLE_SIGNATURE_RECTANGLE" />
		</span><br /><br /> 
		
		
		<span class="Reason">
		<b>Reason:</b><input type="text" name="REASON" />
		</span><br /><br /> 
	
	
		<span class="location">
		<b>Location:</b><input type="text" name="LOCATION" />
		</span><br /><br /> 
	
		<span class="tsa_url">
		<b>TSA_URL:</b><input type="text" name="TSA_URL" />
		</span><br /><br /> 
		
		<span class="pdf_file">
		<b>PDF_file(enter in BASE64):</b><input type="text" name="PDF_FILE" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" id="myFile" name="PDF_FILE">
		</span><br /><br />
		 
		<br /><br /> 
		
		<input type="submit" value="Submit" style="height:20px; width:60px"/>

	</form>
	</div>
	
</body>
</html>