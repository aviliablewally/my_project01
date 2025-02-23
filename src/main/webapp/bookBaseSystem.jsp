<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2024/2/23
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>bookBaseSystem</title>
</head>
<body>


<div style="background-image: url('image/a1.jpg') ;width: 1450px">
<div align="right" style="padding-right: 350px">
    <c:if test="${cardID!=2}">
    <p>${root}</p>
    </c:if>
    <c:if test="${cardID==2}">
        <p6>欢迎管理员进行数据访问</p6>
        <br>
        <a href="/updateUserCardTranferServlet?username=${root}&cardID=${cardID}">点击进行用户更新</a>
    </c:if>


    <c:if test="${cardID!=0}">

        <button onclick=location.href="insertBookTransferServlet?root=${root}&cardID=${cardID}">上传书籍</button>
    </c:if>
</div>
<div>
    <table border="15" align="center" style="background-color: white">
        <tr style="width: 200px;height: 60px">
            <th colspan="4" align="center">书籍信息</th>
                <%--<td>${bookList}</td>--%>
        </tr>
        <tr>
            <td>

           ！     <table border="4" style=" border-collapse: collapse; ">

                    <c:forEach items="${bookList}" var="bookList" varStatus="number">
                        <tr>
                            <td rowspan="4"><p>${number.count}</p></td>
                        </tr>
                        <tr style="width: 50px;height: 40px">
                            <td rowspan="4">
                                <img src="http://192.168.0.100/image/bookPicture/${bookList.bookName}.jpg" width="100px"
                                     height="100px">
                            </td>
                            <td>图书:</td>
                            <td colspan="3">${bookList.bookName}
                            </td>
                            <td rowspan="4">${bookList.reader}</td>
                            <td rowspan="4" align="center">
                                <c:if test="${bookList.reader==root}">
                                    <text style="color: cornflowerblue">已订阅</text>
                                    <br>
                                    <button onclick=location.href="/cancelServlet?reader=${root}&id=${bookList.id}&cardID=${cardID}">
                                        申请还书
                                    </button>
                                    <br>
                                </c:if>
                                <c:if test="${bookList.reader!=root}">

                                    <c:if test="${bookList.reader=='无'}">
                                        <button onclick=location.href="subscribeServlet?reader=${root}&id=${bookList.id}&cardID=${cardID}">
                                            订阅
                                        </button>
                                        <br>
                                    </c:if>
                                    <c:if test="${bookList.reader!='无'}">
                                        <text>不可订阅</text>
                                        <br>
                                    </c:if>
                                </c:if>
                                <c:if test="${cardID==2}">
                                    <button onclick=location.href="/deleteServlet?root=${root}&id=${bookList.id}&cardID=2">删除</button>
                                    <%--删除方法最后写--%>
                                    <br>
                                </c:if>

                                <c:if test="${cardID!=0}">
                                    <button onclick=location.href="/updateBookTransferServlet?root=${root}&id=${bookList.id}&cardID=1">
                                        修改
                                    </button>
                                    <br>
                                </c:if>
                            </td>
                        </tr>
                        <tr style="width: 50px;height: 40px">
                            <td>作者:</td>
                            <td colspan="3">${bookList.bookWriter}</td>

                        </tr>
                        <tr style="width: 50px;height: 40px">
                            <td>简介:</td>
                            <td colspan="3">
                                    ${bookList.bookBrief}
                            </td>
                        </tr>

                    </c:forEach>
                </table>
            </td>
        </tr>
    </table>
</div>
</div>
</body>
</html>