<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Bootstrap Admin Theme v3</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <!-- styles -->
    <link href="../../css/styles.css" rel="stylesheet">
	  <script type="text/javascript" src="../../js/jquery-3.0.0.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
	  <script type="text/javascript">
		  $(function(){
		      $(".btn").first(0).click(function(){
		          $("#signForm").submit();
			  });
		  });
	  </script>
    <![endif]-->
  </head>
  <body class="login-bg">
  	<div class="header">
	     <div class="container">
	        <div class="row">
	           <div class="col-md-12">
	              <!-- Logo -->
	              <div class="logo">
	                 <h1><a href="index.html">Bootstrap Admin Theme</a></h1>
	              </div>
	           </div>
	        </div>
	     </div>
	</div>

	<div class="page-content container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-wrapper">
			        <div class="box">
						<form action="/loginAdmin" method="post" id="signForm">
			            <div class="content-wrap">
			                <h6>Sign Up</h6>
			                <input class="form-control" type="text" name="userName" placeholder="userName">
			                <input class="form-control" type="password" name="password" placeholder="Password">
			                <input class="form-control" type="password" placeholder="Confirm Password">
			                <div class="action">
			                    <button class="btn btn-primary signup">Sign Up</button>
			                </div>                
			            </div>
						</form>
			        </div>
			        <div class="already">
			            <p>Have an account already?</p>
			            <a href="login.jsp">Login</a>
			        </div>
			    </div>
			</div>
		</div>
	</div>



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/custom.js"></script>
  </body>
</html>