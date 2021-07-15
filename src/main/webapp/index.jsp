<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>CreditCard-Home Page</title>
</head>
<body style="background-color: #00FFFF;">
	<h1>Check for Credit Card Eligibility</h1>

	<form action="checkEligibility" method="post">
		<table border=1>

			<tr>
				<td><label for="pan">Enter PAN Number:</label> <input
					type="text" name="pan" id="panNo"
					pattern="(?=.*\d)(?=.*[a-zA-Z]).{10}" required></td>
			</tr>
			<tr>
				<td><input type="submit" id="check" name="Check" value="Check"></td>
			</tr>
		</table>
	</form>
	<br /> ${result}
</body>
</html>