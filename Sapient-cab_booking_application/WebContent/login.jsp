<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
 <head>
    <script type="text/javascript">
	
	   
	   function Login_Form_Check(frm){
	             
	
                if(frm.si_UserName.value=="")
	               {
		              alert("enter ur user name ");
		              frm.si_UserName.focus();
		              return(false);
	               }
	            if(frm.si_Password.value=="")
	               {
	               	 alert("enter ur password");
		             frm.si_Password.focus();
		             return(false);
	               }
				 
					 
	
         }
	</script>


 </head>
<body bgcolor='white'>
  
<font face="verdana,arial" size=-1>
<center>
<table cellpadding='2' cellspacing='2' border='0' id='Si_login_table' width="450"  >
 <tr>
    <th bgcolor="white">
	       <table cellpadding='2' cellspacing='2' border='1' width='450' id='Si_login_table'><tr><td bgcolor="white" align=center style="padding:2;padding-bottom:4"><b><font size=-1 color="black" face="verdana,arial"><b>Enter your login and password</b></font>
	</th>
 </tr>
<tr>
    <td  style="padding:5"><br>
   <html:form   method="post" action="login" styleId="si_LoginForm" onsubmit='return Login_Form_Check(this)'>

<center>
      <table >
        <tr>
		  <td><font face="verdana,arial" size=-1>User Name</td>
		  <td><html:text property="siUserName" />

        <tr>
          <td> <font face="verdana,arial" size=-1>Password</td>
		  <td><html:password property="siPassword" /></td>
       </tr>
       <tr>
            <td colspan='2'>&nbsp;</td>
  
       </tr>
        <tr>
   
           <td align='center' colspan='2'><font face="verdana,arial" size=-1><input type="submit"       value="Login"><input type='reset' value='Reset'>  
           </td> 
        </tr>

      </table>
         </center>
</html:form>
</td>
</tr></table></td></tr></table>


</body>
</html>