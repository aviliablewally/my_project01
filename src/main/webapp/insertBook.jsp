<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2024/2/25
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>上传图书</title>
</head>
<body>
<div style=" background-image: url('image/a1.jpg') ;height: 724px;width: 1450px">


<button onclick=location.href="/bookServlet?username=${username}&cardID=${cardID}">返回</button>
<div align="right" style="padding-right: 350px">
    <c:if test="${cardID!=2}">
        <p>点击<a href="/DetailUpdata.html">${root}</a>修改个人信息</p>
    </c:if>
    <c:if test="${cardID==2}">
        <p6>欢迎管理员进行数据访问</p6>
    </c:if>
</div>
<hr>
<div>
    <form method="post" action="/insertBookServlet" >

        <table align="center" border="4" style="background-color: white">

            <tr style="display: none">
                <td><input type="text" value="${root}" name="root"></td>
                <td><input type="text" value="${cardID}" name="cardID"></td>
            </tr>

            <tr>
                <td>书籍名称:</td>
                <td><input type="text" name="bookName"/>
            </tr>
            <tr style="width: 50px;height: 40px">
                <td>作者:</td>
                <td colspan="3"><input type="text" name="bookWriter"></td>

            </tr>
            <tr style="width: 50px;height: 40px">
                <td>简介:</td>
                <td colspan="3">
                    <textarea style="width: 300px;height: 200px" name="bookBrief" ></textarea>
                </td>
            </tr>

            <tr style="height: 50px">
                <td colspan="3" align="center">
                    <input size="30px" type="submit">
                </td>
            </tr>
        </table>
    </form>

</div>
</div>
</body>
</html>
