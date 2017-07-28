<!DOCTYPE html>
<head>
	<title>home</title>
	<link rel="stylesheet" type="text/css" href="style_contacts.css">
</head>
<body>
	<div id="top">
	<header>
	<h3>Contacts</h3>
	</header>
	</div>
     <div id="contact_list">
	<%@ page import="com.lxisoft.controller.*,com.lxisoft.model.Contact,java.util.*" %>

    <%ContactController contactController=new ContactController();
    List<Contact> contactList=contactController.getContacts();
    for(int i=0;i<contactList.size();i++)
    	{
    %>

    <p id="individual_contacts"><% out.println((i+1)+". "+contactList.get(i)); %> </p>
    <%}%>
	
	</div>
	
</body>
</html>