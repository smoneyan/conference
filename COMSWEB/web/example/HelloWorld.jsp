<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>

    <body>
        <h2><s:property value="message"/></h2>

        <h3>Languages</h3>
        <ul>
            <li>
                <s:url id="url" action="HelloWorld">
                    <s:param name="request_locale">en</s:param>
                </s:url>
                <s:a href="%{url}">English</s:a>
            </li>

            <li>
                <s:url id="url" action="HelloWorld">
                    <s:param name="request_locale">es</s:param>
                </s:url>

                <s:a href="%{url}">Espanol</s:a>

            </li>
        </ul>
                <s:form action="email"><table width="100%">
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="<s:text name="email"/>" 
					align="middle" /> &nbsp;&nbsp;&nbsp; <input type="reset"
					value="<s:text name="reset"/>" class="butStnd"
					align="middle" /></td>
			</tr>
		</table></s:form>
    </body>
</html>

