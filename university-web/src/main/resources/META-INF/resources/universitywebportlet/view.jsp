<%@ include file="../init.jsp" %>
<liferay-ui:success key="studentAdded" message="student-added"/>
<liferay-ui:success key="studentDeleted" message="student-deleted"/>

<%
    long universityId = Long.valueOf((Long) renderRequest.getAttribute("universityId"));
%>

<aui:nav cssClass="nav-tabs">

    <%
        List<University> universities = UniversityLocalServiceUtil.getUniversities(scopeGroupId);

        for (int i = 0; i < universities.size(); i++) {

            University curUniversity = universities.get(i);
            String cssClass = StringPool.BLANK;

            if (curUniversity.getUniversityId() == universityId) {
                cssClass = "active";
            }

            if (UniversityModelPermission.contains(
                    permissionChecker, curUniversity.getUniversityId(), "VIEW")) {

    %>

    <portlet:renderURL var="viewPageURL">
        <portlet:param name="mvcPath" value="/universitywebportlet/view.jsp"/>
        <portlet:param name="universityId"
                       value="<%=String.valueOf(curUniversity.getUniversityId())%>"/>
    </portlet:renderURL>


    <aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
                  label="<%=HtmlUtil.escape(curUniversity.getName())%>"/>

    <%
            }

        }
    %>

</aui:nav>

<aui:button-row cssClass="university-buttons">
    <c:if test='<%= UniversityPermission.contains(permissionChecker, scopeGroupId, "ADD_ENTRY") %>'>
        <portlet:renderURL var="addStudentURL">
            <portlet:param name="mvcPath" value="/universitywebportlet/edit_student.jsp"/>
            <portlet:param name="universityId"
                           value="<%=String.valueOf(universityId)%>"/>
        </portlet:renderURL>
        <aui:button onClick="<%=addStudentURL.toString()%>" value="Add Student"></aui:button>
    </c:if>
</aui:button-row>

<liferay-ui:search-container total="<%=StudentLocalServiceUtil.getStudentsCount()%>">
    <liferay-ui:search-container-results
            results="<%=StudentLocalServiceUtil.getStudents(scopeGroupId.longValue(),
                    universityId, searchContainer.getStart(),
                    searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ir.sain.university.model.Student" modelVar="student">

        <liferay-ui:search-container-column-text property="name"/>

        <liferay-ui:search-container-column-text property="phone"/>

        <liferay-ui:search-container-column-jsp
                align="right"
                path="/universitywebportlet/student_actions.jsp"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>

</liferay-ui:search-container>