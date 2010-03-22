<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,br.com.acervotcc.dao.*,br.com.acervotcc.modelo.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th >Código</th>
				<th  >Nome</th>
			</tr>
		</thead>
		<tbody>
		<%
			CursoDao dao = new CursoDao();
			List<Curso> cursos = dao.listar();
			for(Curso curso : cursos){
		%>
			<tr>
				<td  ><%=curso.getCurId()%>	</td>	
				<td ><%=curso.getCurNome()%>	</td>	
			</tr>
			
		<%
			}
		%>	
		</tbody>
	</table>
</body>
</html>