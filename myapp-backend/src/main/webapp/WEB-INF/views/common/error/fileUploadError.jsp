<%@ page pageEncoding="UTF-8"%>
<% response.setStatus(HttpServletResponse.SC_BAD_REQUEST); %>
<%
response.setContentType("application/json;charset=UTF-8");
%>
{"result":[{"discription":"アップロードできるファイルのサイズは、5MB以下です。","errorId":"E00004"}]}
