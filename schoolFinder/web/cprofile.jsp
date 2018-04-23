<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <link href="css/cprofile.css" rel="stylesheet" type="text/css"/>
       <div class="Header">
            <div class="logo">
            <img src="folder/logo1.png" class="img" alt=""/>
            </div>
            <div class="heading">
            <h1>Welcome To School-Finder</h1>
            </div>
        </div>
        <div class="class1">
            <img class="class2" src=<%--type jsp code here--%>  alt=""/><h1><%--SchoolNAME Retrieval--%></h1>
        </div><br><br>
        <div class="class3">
            <label>BOARD:</label><label onclick="beep"> MEDIUM:</label>            
        </div>
        <div class="class4">
            <table border="1" class="class5">
                <tr><th colspan="2" bgcolor="maroon"class="th">LOCATION</th></tr>
                <tr><td class="class7"><%--ADD1--%>Address1</td><td class="class6" rowspan="6"> <img class="classic" src=<%--type jsp code here--%>  alt=""/><%--MAP--%></td></tr>
                <tr><td class="class7">Address2</td></tr>
                <tr><td class="class7">Address3</td></tr>
                <tr><td class="class7">Address4</td></tr>
                <tr><td class="class7">Phone</td></tr>
                <tr><td class="class7">Email</td></tr>
            </table>          
        </div>
                <div class="royal">
                    <table border="1" class="class8">
                        <tr><th bgcolor="pink"class="th2">ABOUT</th></tr>
                        <tr class="class9"><td>hi</td></tr>   
                      
                    </table>
                    <table border="1" class="tok">
                        <tr><th colspan="2" bgcolor="skyblue" class="th2">FACILLITIES</th></tr>
                        <tr class="toko"><td class="toku">SMART CLASSROOM</td><td class="toki"></td>  </tr>
                        <tr class="toko"><td class="toku">PLAY GROUND</td ><td class="toki"></td>  </tr>
                        <tr class="toko"><td class="toku">Library</td><td class="toki"></td>  </tr>
                        <tr class="toko"><td class="toku"></td><td class="toki"></td>  </tr>
                        <tr class="toko"><td class="toku"></td><td class="toki"></td>  </tr>
                        <tr class="toko"><td class="toku"></td><td class="toki"></td>  </tr>
                        <tr class="toko"><td class="toku"> </td><td class="toki"></td>  </tr>
                    </table>
                        
                 </div> 
    </body>
</html>
