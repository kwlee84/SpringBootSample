<h1>${message}</h1>
<form action="/logout" method="post">
	<input type="hidden" id="csrf-token" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	<input type="submit" value="LOGOUT"/>
</form>