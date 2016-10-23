<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" isELIgnored="true"%>
<%@page	import="org.apache.taglibs.standard.tag.common.core.ForEachSupport" %>
	<%@page	import="java.util.Calendar,java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>

<html>
	<head>
		<title>Emloyee Details form</title>







		<script type="text/javascript">

function employeeFormCheck(frm) {

	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter the Employee Type<br>Enter your password<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}

	if ( frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the Employee Name<br>Enter the Employee Type<br>Enter your password<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpName.focus();
		return (false);
	}
	if ( frm.siEmpId.value == ""
			&& frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Type<br>Enter your password<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if ( frm.siEmpId.value == ""
			 && frm.siPassword.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter your password<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0 
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter the Employee Type<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			 && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter the Employee Type<br>Enter your password<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			&& frm.siSalary.value == "" ) {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter the Employee Type<br>Enter your password<br>Enter your Salary";

		frm.siEmpId.focus();
		return (false);
	}
	
	
	
	if (frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the Employee Type<br>Enter your password<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpType.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" &&  frm.siPassword.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter your password<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siSalary.value == "" && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter your Salary<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0  && frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter the Employee Type<br>Enter your Mail Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpId.value == "" && frm.siEmpName.value == ""
			&& frm.siEmpType.selectedIndex == 0 && frm.siPassword.value == ""
			 ) {
		document.getElementById("si_div2").innerHTML = "Enter the LoginId<br>Enter the Employee Name<br>Enter the Employee Type<br>Enter your password";

		frm.siEmpId.focus();
		return (false);
	}	

	if (frm.siEmpId == "") {
		document.getElementById("si_div2").innerHTML = "Enter the Login Id";

		frm.siEmpId.focus();
		return (false);
	}
	if (frm.siEmpName == "") {
		document.getElementById("si_div2").innerHTML = "Enter the Employee Name";

		frm.siEmpName.focus();
		return (false);
	}
	if (frm.siEmpType.selectedIndex == 0) {
		document.getElementById("si_div2").innerHTML = "Enter the Employee Type";

		frm.siEmpType.focus();
		return (false);
	}
	if (frm.siPassword.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter your Password";

		frm.siPassword.focus();
		return (false);
	}
	if (frm.siSalary.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter your Salary";

		frm.siSalary.focus();
		return (false);
	}
	if (frm.siMailId.value == "") {
		document.getElementById("si_div2").innerHTML = "Enter the Mail Id";

		frm.siMailId.focus();
		return (false);
	}
	
	
	
	return checkEmail(frm.siMailId.value); 	

	

}

function checkEmail(email) 
{
     if (email.length == 0) {
         window.alert("You must provide an e-mail address.");
          return false;
      }

    if (email.indexOf("/") > -1) 
      {
          window.alert("E-mail address has invalid character: /");
          return false;
      }
   if (email.indexOf(":") > -1) 
     {
       window.alert("E-mail address has invalid character: :");
       return false;
     }
   if (email.indexOf(",") > -1) 
      {
     window.alert("E-mail address has invalid character: ,");
      return false;
    }
  if (email.indexOf(";") > -1) 
  {
      window.alert("E-mail address has invalid character: ;");
    return false;
  }
  if (email.indexOf("@") < 0) 
     {
     window.alert("E-mail address is missing @");
     return false;
    }
  if (email.indexOf("\.") < 0) {
        window.alert("E-mail address is missing .");
        return false;
     }
   return true;
}    
</script>



	</head>

	<body style="margin: 0;">
		<center>
			<div id="si_div44">


				<form name="loginDetailForm" id="siLoginForm" action="employeeDetails.do"
					method="post" onSubmit="return employeeFormCheck(this)">


					<center>
						<table width='910px' id="siEmpTable" cellpadding="2"
							cellspacing="2" border='2' bordercolor="gray">




							<tr id='Si_row1'>
								<td id='Si_row1_col1' align='center'>
									&nbsp;&nbsp;&nbsp;&nbsp;PickUpLocation*
								</td>
								<td align='center' id='Si_row1_col2'>
									<select id="pickUplocation" name="pickUplocation">
										<option></option>

										<option value="hinjewadi">
											Hinjewadi
										</option>
										<option value="aundh">
											Aundth
										</option>
										<option value="banner">
											Banner
										</option>
										<option value="mgroad">
											Mg_Road
										</option>
										<option value="magarpata">
											Magarpata
										</option>
										<option value="coregaonPark">
											CoregaonPark
										</option>
										<option value="sangvi">
											Sangvi
										</option>
										<option value="wakad">
											Wakad
										</option>
										<option value="Dproad">
											Dp road
										</option>
										<option value="shivajinagar">
											Shivaji Nagar
										</option>
										<option value="pimprichinchewad">
											pimprichinchewad
										</option>
									</select>&nbsp;

								</td>
								<td align='center' id='Si_row1_col3'>
									Drop Location*
								</td>
								<td align='center' id='Si_row1_col4'>
									<select id="dropLocation" name="dropLoc">
										<option></option>

										<option value="hinjewadi">
											Hinjewadi
										</option>
										<option value="aundh">
											Aundth
										</option>
										<option value="banner">
											Banner
										</option>
										<option value="mgroad">
											Mg_Road
										</option>
										<option value="magarpata">
											Magarpata
										</option>
										<option value="coregaonPark">
											CoregaonPark
										</option>
										<option value="sangvi">
											Sangvi
										</option>
										<option value="wakad">
											Wakad
										</option>
										<option value="Dproad">
											Dp road
										</option>
										<option value="shivajinagar">
											Shivaji Nagar
										</option>
										<option value="pimprichinchewad">
											pimprichinchewad
										</option>
									</select>&nbsp;



								</td>
							</tr>

							<tr id='Si_row2'>
								<td id='Si_row2_col1' align='center'>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Current_Date*
								</td>
								<td align='center' id='Si_row2_col2'>
									&nbsp;&nbsp;&nbsp;
									<%
									  Calendar cl=Calendar.getInstance();
									  Date dt=cl.getTime();
									  PrintWriter io=response.getWriter();
									  
									  
									 %>
									 <input type='text' value='<%=dt %>' disabled='disabled'>
									
								</td>
								<td align='center' id='Si_row2_col3'>
									Current Time*


								</td>
								<td align='center'>
									<select id="currTime" name="currtime">
										<option></option>

										<option value="1">
											1
										</option>
										<option value="2">
											2
										</option>
										<option value="3">
											3
										</option>
										<option value="4">
											4
										</option>
										<option value="5">
											5
										</option>
										<option value="6">
											6
										</option>
										<option value="7">
											7
										</option>
										<option value="8">
											8
										</option>
										<option value="9">
											9
										</option>
										<option value="10">
											10
										</option>
										<option value="11">
											11
										</option>
										<option value="12">
											12
										</option>
										<option value="13">
											13
										</option>
										<option value="14">
											14
										</option>
										<option value="15">
											15
										</option>
										<option value="16">
											16
										</option>
										<option value="17">
											17
										</option>
										<option value="18">
											18
										</option>
										<option value="19">
											19
										</option>
										<option value="20">
											20
										</option>
										<option value="21">
											21
										</option>
										<option value="22">
											22
										</option>
										<option value="23">
											23
										</option>
										<option value="24">
											24
										</option>
									</select>&nbsp;::
									<select id="minute" name="minute">
									<%
									int i=0;
									for( i=1;i<60;i++){
									%>
									<option value=<%=i %> ><%=i %></option>
									<%
									
									}								
									
									 %>
									 
									 </select>&nbsp;


								</td>
							</tr>

							<tr id='Si_row3' align='center'>
								<td id='Si_row3_col1' align='center'>
									&nbsp;&nbsp;PickUp Address*&nbsp;&nbsp;
								</td>
								<td id='Si_row3_col2' align='center'>
									<input type="text" name="pickupAdd" id="pickupAdd" size='70' onkeypress="if ( isNaN( String.fromCharCode(event.keyCode) )) return false;">
								</td>
								<td id='Si_row3_col1' align='center'>
									Cab Type*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</td>
								<td id='Si_row3_col2' align='center'>
									<select name="type"id="cab_type">
									  <option id="mini">mini</option>
									  <option id="sedan">sedan</option>
									</select>
								</td>

							</tr>
							<tr>
								<td colspan='4'>
									&nbsp;
									<input type='hidden' name="empId"  value='no' />
								</td>
							</tr>


							<tr id='Si_row7'>
								<td colspan="4" align="center" id='Si_row7_col1'>
									<input type="submit" value="Submit" id='Si_submit'>
									&nbsp;
									<input type="reset" value="Reset" id='Si_reset'>
									&nbsp;

								</td>
							</tr>


						</table>
					</center>
				</form>

			</div>

			<font color="red" size='4px'>
				<div id='si_div2'>
				</div> </font>

		</center>
	</body>
</html>
