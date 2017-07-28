
<!DOCTYPE html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="style_contacts.css">
</head>
<body>

	<div id="top">
	<h3>Contacts</h3>
	</div>

	<div id="question">
		<%@ page import="com.lxisoft.controller.*,java.util.*,com.lxisoft.model.Contact" %>
		<%ContactController contactController=new ContactController();
			List<Contact> contactList=contactController.getContacts();
			for(int i=0;i<contactList.size();i++)
			{

		%>
			<p id="question">&nbsp; <% out.println(contactList.get(i)); %></p><!-- print question-->
		<%}%>
		</div>

</body>
</html>