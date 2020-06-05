<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./commons/header/metaHeader.jsp"%>
<%@include file="./freqView/metaHeader.jsp"%>

</head>
<body>
	<%-- <%@include file="./commons/loader.jsp"%>
	<%@include file="./commons/header/header.jsp"%> --%>
	<div class="container">
		<br /> <br /> <br />
		<div id="accordion">
			<div class="faqHeader">General questions</div>
			<div class="card ">
				<div class="card-header">
					<h4 class="card-header">
						<a class="accordion-toggle" data-toggle="collapse"
							data-parent="#accordion" href="#collapseOne">Is account
							registration required?</a>
					</h4>
				</div>
				<div id="collapseOne" class="panel-collapse collapse in">
					<div class="card-block">
						Account registration at <strong>PrepBootstrap</strong> is only
						required if you will be selling or buying themes. This ensures a
						valid communication channel for all parties involved in any
						transactions.
					</div>
				</div>
			</div>
			<div class="card ">
				<div class="card-header">
					<h4 class="card-header">
						<a class="accordion-toggle collapsed" data-toggle="collapse"
							data-parent="#accordion" href="#collapseSeven">Is this the
							latest version of an item</a>
					</h4>
				</div>
				<div id="collapseSeven" class="panel-collapse collapse">
					<div class="card-block">
						Each item in <strong>PrepBootstrap</strong> is maintained to its
						latest version. This ensures its smooth operation.
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>