<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="openhome" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gossip 微网志</title>
        <link rel="stylesheet" href="css/index.css" type="text/css">
    </head>
    <body>
        <div class="leftPanel">
            <img src='images/caterpillar.jpg' alt='Gossip 微网志'/>
            <div>
                <a href='register.jsp'>还不是会员？</a><p>
                <div style='color: rgb(255, 0, 0);'>${ requestScope.error }</div>
                <form method='post' action='login.do'>
                    <table bgcolor='#cccccc'>
                         <tr>
                            <td colspan='2'>会员登入</td>
                        </tr>
                        <tr>
                            <td>名称：</td>
                            <td><input type='text' name='username' value="${ param.username }"></td>
                        </tr>
                        <tr>
                            <td>密码：</td>
                            <td><input type='password' name='password'></td>
                        </tr>
                        <tr>
                            <td colspan='2' align='center'><input type='submit' value='登入'></td>
                        </tr>
                        <tr>
                            <td colspan='2'><a href='forgot.html'>忘记密码？</a></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>  
        <div>
            <h1>Gossip ... XD</h1>
               <ul>
                    <li>谈天说地不奇怪
                    <li>分享讯息也可以
                    <li>随意写写表心情
               </ul>
               <openhome:Blahs/>
        </div>
    </body>
</html>