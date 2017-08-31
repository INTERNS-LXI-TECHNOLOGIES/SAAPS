<!DOCTYPE html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css\mystyle.css">
</head>
<body>

	<div class="jumbotron top">
	<img class="img-fluid contacts_icon" src="Images\contacts_2.png" alt="Contacts_icon">	
	<h2>Contacts</h2>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 search_contact_box">
			<form action="search_result.jsp" method="GET">
				<input type="search" placeholder="Search...." name="name">
			</form>
	</div> 
	<div class="col-sm-4 text-center">
	<a href="create_contact.jsp">
  	<span title="Add new contact"><img src="Images\add_contact_1.png" alt="Create new contact"  ></span>
	</a>
	</div>
	</div> 

	<!--<img src="add-512.png" alt="Mountain View">-->

	<div class="contact_container">
		<%@ page import="com.lxisoft.controller.*,java.util.*,com.lxisoft.model.Contact" %>
		<%
			if((ContactController.isSetCreated())==false)
			{
				ContactController.initializeContactSet();
			}
			Set<Contact> contactSet=new TreeSet<Contact>(ContactController.getContactSet());
			//NameSorter nameSorter=new NameSorter();
			//Collections.sort(contactList);	
			
			//Collections.sort(contactList);
			for(Contact contact:contactSet)
			{%>
			<div class="row individual_contact_row">
			<div class="col-sm-8 individual_contact">
			<img class="individual_contact_icon" src="Images\contact_1.png" alt="contact_picture"><p><a href="contact_details.jsp?link=<%out.println(contact.getPhNo());%>"><% out.println(contact); %></a></p>
			</div>
			<div class="col-sm-4 text-center">
				<a href="edit_contact.jsp?link=<%out.println(contact.getPhNo());%>"><img class="align" src="Images\edit_1.png"></a>
				<a href="delete_contact_redirect.jsp?link=<%out.println(contact.getPhNo());%>"><img class="align" src="Images\delete_3.png"></a>
			</div>
			</div> 
		<%}%>
		<ul class="pagination page-item">
			<li class="page-link"><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li class="page-link"><a href="#">4</a></li>
		</ul>
	</div>
	</div>
</body>
</html>                                                                                       