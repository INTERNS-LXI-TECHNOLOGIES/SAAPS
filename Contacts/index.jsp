<!DOCTYPE html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="style_quiz.css">
</head>
<body>
	<div id=top>
	<header>
	<h3>People</h3>
	</header>
	</div>
	<%@ page import="com.lxisoft.Controller.*,java.util.*,com.lxisoft.Model.Contact"%>
	<%ContactController contact=new ContactController();
		List<Contact> contactList=contact.getContacts();
		for(int i=0;i<contactList.size();i++)
		{%>
	<p id="question">&nbsp;<% out.println(contactList.get(i)); %></p>
	<%}%>
	</div>

</body>
</html>



	


