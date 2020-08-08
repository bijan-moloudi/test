<%@ include file="/init.jsp" %>

<portlet:renderURL var="addStudentRndUrl">
    <portlet:param name="mvcPath" value="/edit_student.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
    <aui:button onClick="<%= addStudentRndUrl.toString() %>" value="add student"> </aui:button>
</aui:button-row>
