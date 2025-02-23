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
    <title>修改书籍信息</title>
</head>
<body>
<div style=" background-image: url('image/a1.jpg') ;height: 724px;width: 1450px">
<button onclick=location.href="/bookServlet?username=${username}&cardID=${cardID}">返回</button>
<div align="right" style="padding-right: 350px">
    <c:if test="${cardID!=2}">
        <p>${root}</p>
    </c:if>
    <c:if test="${cardID==2}">
        <p6>欢迎管理员进行数据访问</p6>
    </c:if>
</div>
<hr>
<div>
    <form method="post" action="/updateBookServlet">

        <c:forEach items="${bookList}" var="bookList" varStatus="number">

            <table align="center" border="4" style="background-color: white">

                <tr style="display: none">
                    <td><input type="text" value="${bookList.id}" name="bookID"></td>
                    <td><input type="text" value="${root}" name="root"></td>
                    <td><input type="text" value="${bookList.reader}" name="reader"></td>
                    <td><input type="text" value="${cardID}" name="cardID"></td>
                </tr>
                <tr>
                    <td rowspan="4">
                        <img src="http://192.168.0.101/image/bookPicture/${bookList.bookName}.jpg" width="100px"
                             height="100px">
                    </td>
                    <td>书籍名称:</td>
                    <td><input type="text" value="${bookList.bookName}" name="bookName"/>
                </tr>
                <tr style="width: 50px;height: 40px">
                    <td>作者:</td>
                    <td colspan="3"><input type="text" value="${bookList.bookWriter}" name="bookWriter"></td>

                </tr>
                <tr style="width: 50px;height: 40px">
                    <td>简介:</td>
                    <td colspan="3">
                        <textarea name="bookBrief" style="width: 305px;height: 140px">${bookList.bookBrief}</textarea>
                    </td>
                </tr>

                <tr style="height: 50px">
                    <td colspan="3" align="center">
                        <!--<a href="Resgister.html" style="float: left;size: 1px; ;">注册</a>-->
                        <input size="30px" type="submit">
                    </td>
                </tr>
            </table>


        </c:forEach>
    </form>
</div>
</div>
</body>
</html>
