<%@page import="objetos.Causa"%>
<%@page import="java.util.*"%>
<%@page import="conectar.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="index.css">

<meta charset="ISO-8859-1">
<title>Encontre uma causa</title>
</head>
<body>
<%! 
Query querys = new Query();

ArrayList<Causa> causas = querys.selectCausa(); %>
<div class="container">
<div class="box">
			Escolha uma causa</p><br>
			
			<select name="Causas" id="causas">
			<%
			for(int i = 0; i < causas.size(); i++){
			
				out.print("<option value='"+causas.get(i).getNome()+"'>"+causas.get(i).getNome()+"</option>");
				
			}
			%>
			
			
			</select>
</div>
</div>
</body>
</html>