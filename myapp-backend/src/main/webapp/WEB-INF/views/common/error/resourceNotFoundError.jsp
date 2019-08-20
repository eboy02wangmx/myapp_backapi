<%@ page pageEncoding="UTF-8"%>
<%

if(request.getContentType() != null) {
	response.setContentType(request.getContentType() + ";charset=UTF-8");
}

if(request.getContentType() != null && request.getContentType().contains("application/json")) { %>
{"result":[{"discription":"Resource Not Found","errorId":"404"}]}
<% } else {%>
404 Resource Not Found
<% }%>
