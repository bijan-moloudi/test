<%@ include file="/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param value="/view.jsp" name="mvcPath"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addstudent" var="addStudentActURL"></portlet:actionURL>

<aui:form action="<%= addStudentActURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="name"></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>