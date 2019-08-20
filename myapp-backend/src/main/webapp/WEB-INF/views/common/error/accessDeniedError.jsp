<%@ page pageEncoding="UTF-8"%>
<%

if(request.getContentType() != null) {
	response.setContentType(request.getContentType() + ";charset=UTF-8");
}

if(request.getContentType() != null && request.getContentType().contains("application/json")) { %>
{"result":[{"discription":"Access denied","errorId":"401"}]}
<% } else {%>
401 Access denied
<% }%>
