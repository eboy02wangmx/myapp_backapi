<%@ page pageEncoding="UTF-8"%>
<%

if(request.getContentType() != null) {
	response.setContentType(request.getContentType() + ";charset=UTF-8");
}

if(request.getContentType() != null && request.getContentType().contains("application/json")) { %>
{"result":[{"discription":"Forbidden","errorId":"403"}]}
<% } else {%>
403 Forbidden
<% }%>
