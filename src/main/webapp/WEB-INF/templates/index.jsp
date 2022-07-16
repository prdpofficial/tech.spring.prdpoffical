<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<!-- start home -->
    	<section id="home">
    		<div class="container">
    			<div class="row">
    				<div class="col-md-offset-2 col-md-8">
    					<h1 class="wow fadeIn" data-wow-offset="50" data-wow-delay="0.9s">Welcome to <span>prdpofficial.tech</span></h1>
    					<div class="element">
                            <div class="sub-element">Hello, this is Pradeep Singh Rajawat</div>
                            <div class="sub-element">Java/J2EE Developer</div>
                            <div class="sub-element">And this is my website</div>
                        </div>
    					<a data-scroll href="#contact" class="btn btn-default wow fadeInUp" data-wow-offset="50" data-wow-delay="0.6s">GET STARTED</a>
    				</div>
    			</div>
    		</div>
    	</section>
    	<!-- end home -->

    	

    	

    	<!-- start service -->
    	<section id="service">
    		<div class="container">
    			<div class="row">
    				<div class="col-md-12">
    					<h2 class="wow bounceIn" data-wow-offset="50" data-wow-delay="0.3s"><!-- OUR --> <span>SKILLS</span> <!-- THINGS --></h2>
    				</div>
    				<c:forEach items="${skills}" var="i">
    				<div class="col-md-4 wow fadeIn" data-wow-offset="50" data-wow-delay="0.6s"align="center">
    					<i class="fa fa-laptop"></i>
    					<h4> ${i.skillName} </h4>
    				</div>
    				</c:forEach>
    				
    			</div>
    		</div>
    	</section>
    	<!-- end service -->

    	

    	<!-- start contact -->
    	<section id="contact">
    		<div class="container">
    			<div class="row">
    				<div class="col-md-12">
    					<h2 class="wow bounceIn" data-wow-offset="50" data-wow-delay="0.3s">CONTACT <span>PrdpOfficial.Tech</span></h2>
    				</div>
    				<div class="col-md-6 col-sm-6 col-xs-12 wow fadeInLeft" data-wow-offset="50" data-wow-delay="0.9s">
    				
						
						<form action="enquiryForm" method="post" >
							<!-- {% csrf_token %} -->
    						<label>NAME</label>
    						<input name="fullName" type='text' class="form-control" id="fullname">
   						  	
                            <label>EMAIL</label>
    						<input name="email" type="email" class="form-control" id="email">
    						
    						<label>MOBILE</label>
    						<input name="mobile" type="text" class="form-control" id="email" min="10" max="10">
   						  	
                            <label>MESSAGE</label>
    						<textarea name="message" rows="4" class="form-control" id="message"></textarea>
    						
                            <input type="submit" class="form-control">
    					</form>
    				</div>
    				<div class="col-md-6 col-sm-6 col-xs-12 wow fadeInRight" data-wow-offset="50" data-wow-delay="0.6s">
    					<address>
    						<p class="address-title">OUR ADDRESS</p>
    						<span>YOU CAN CONTACT US...</span>
    						<p><i class="fa fa-phone"></i> +919983908282</p> <br>
    						<p><i class="fa fa-envelope-o"></i> inforajawat007@gmail.com</p> <br>
    						<p><i class="fa fa-map-marker"></i> JAIPUR RAJASTHAN</p>
    					</address>
    					<ul class="social-icon">
    						<li><h4>WE ARE SOCIAL</h4></li>
    						<li><a href="https://www.facebook.com/prdpofficial" class="fa fa-facebook"></a></li>
    						<li><a href="https://twitter.com/PRDP__Official" class="fa fa-twitter"></a></li>
    						<li><a href="https://www.instagram.com/prdp_official/?hl=en" class="fa fa-instagram"></a></li>
							<li><a href="https://www.linkedin.com/in/prdpofficial/?originalSubdomain=in" class="fa fa-linkedin"></a></li>
							<li><a href="https://github.com/prdpofficial" class="fa fa-github"></a></li>
						</ul>
    				</div>
    			</div>
    		</div>
    	</section>
    	<!-- end contact -->

	

        <!-- start copyright -->
        <footer id="copyright">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <p class="wow bounceIn" data-wow-offset="50" data-wow-delay="0.3s">
                       	Copyright &copy; 2022 PrdpOfficial.Tech</p>
                    </div>
                </div>
            </div>
        </footer>
        <!-- end copyright -->



</body>
</html>