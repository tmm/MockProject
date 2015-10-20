<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row toolbar">
	<div class="col-sm-2">
		<div class="btn-group btn-group-justified" role="group"
			aria-label="...">
			<div class="btn-group" role="group">
				<a class="btn btn-default" href="${pageContext.request.contextPath}/open-orders" role="button">Cancel</a>
			</div>
		</div>
	</div>
	
	<div class="col-sm-2 col-sm-offset-8">
		<div class="btn-group btn-group-justified" role="group"
			aria-label="...">
			<div class="btn-group" role="group">
				<button id="selectaddblockbutton" type="button" class="btn btn-default">Select Block</button>
			</div>
		</div>
	</div>
</div>
