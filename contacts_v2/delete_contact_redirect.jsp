
<!DOCTYPE html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="bootstrap.css">
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<meta charset="UTF-8">
</head>
<body>
	<div class="jumbotron top">
	<img class="img-fluid contacts_icon" src="Images\contacts_2.png" alt="Contacts_icon">	
	<h2>Contacts</h2>
	</div>
	<%@ page import="com.lxisoft.controller.*,java.util.*,com.lxisoft.model.Contact"%>

	<% Set<Contact> contactSet=ContactController.getContactSet();
		Contact currentContact=ContactController.getCurrentContact();
 		String phNo=request.getParameter("link");
 		if(phNo.equals(currentContact.getPhNo())==false)
 			for (Contact contact: contactSet) {
 				if(phNo.equals(contact.getPhNo()))
 				{
 					currentContact=contact;
 					ContactController.setCurrentContact(contact);
 				}
 				
 			}
	ContactController.deleteContact(currentContact);
	response.sendRedirect("index.jsp");%>

</body>
</html>