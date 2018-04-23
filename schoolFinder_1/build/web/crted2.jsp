<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link href="css/enroll2.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
         <form action="form3.jsp" method="POST">
        <div class="Header">
            <div class="logo">
            <img src="folder/logo1.png" class="img" alt=""/>
            </div>
            <div class="heading">
            <h1>School-Finder</h1>
            </div>
        </div>
        <div class="enroll">
            <h2>School-Enrollment</h2>
        </div>
        <div class="con-1">
            <input type="file" name="f1" class="file1" />
            <input type="text" name="txtbox" class="txt1" />
            </div>
        <div class="con-2">
            <label>BOARD :<input type="text" class="txt2" name="f2"></label>
            <label>MEDIUM :<input type="text" class="txt2" name="f3"></label>
            <label>SCHOOL CODE :<input type="text" class="txt2" name="f4"></label>
            <button class="butn">Search</button>
            
        </div>  
      
        <div class="try"  >  
        <div class="container">  
        <div class="con-3">
            <h3>CONTACT</h3>
            <input type="text" placeholder="Address 1" name="add1" value="" class="c2" /><br>
            <input type="text" placeholder="Address 2" name="add2" value="" class="c2"/><br>
            <input type="text" placeholder="Email" name="eid" value="" class="c2"/><br>
            <input type="text" placeholder="Phone" class="c2  " name="phone" value="" />
        </div>
            <div class="loc">
                <h3>LOCATION</h3>
                <input type="file" name="map" value="" />
            </div>
            
        <div class="con-5">
           
            <h3>FACILITIES</h3>
            <div class="fac">
            <input type="checkbox" name="SMART CLASSROOM" value="yes" class="check1" />SMART CLASSROOM &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
            <input type="checkbox" name="HOSTEL" value="ON" class="check1" />HOSTEL
            <br>
            <input type="checkbox" name="HANDICAPPED SUPPORT" value="ON" class="check2" />HANDICAPPED SUPPORT  &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox" name="AC" value="ON"class="check2" />MEDICAL
            <br>
            <input type="checkbox" name="TRANSPORT" value="ON" class="check3" />TRANSPORT   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="checkbox" name="MEDICAL" value="ON" class="check3" />SPORTS
			</div>
        </div>  
            
        </div>   
            	</div>   
        <input type="submit" class="add"value="ADD SCHOOL" name="add" />
         </form>
    </body>
</html>