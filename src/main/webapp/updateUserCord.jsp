<%@ page isELIgnored="false" %><%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2024/2/28
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>管理用户信息</title>
</head>
<body>
<div style=" background-image: url('image/a1.jpg') ;height: 724px;width: 1450px">
<button onclick=location.href="/bookServlet?username=${username}&cardID=${cardID}">返回</button>
<div align="right" style="padding-right: 350px">

    <p6>欢迎管理员进行数据访问</p6>
</div>
<hr>
<div>
    <table border="15" align="center" style="background-color: white; border-collapse: collapse;width: 400px;">
        <tr align="center">
            <th colspan="4" align="center">用户信息</th>
        </tr>

        <c:forEach items="${User}" var="user" varStatus="innerStatus">
            <tr>
                <td>
                    <form method="post" action="/updateUserCardServlet" style="height: 100px">
                        <table border="4" style=" border-collapse: collapse;width: 400px">
                            <tr align="center">
                                <td rowspan="5"><p>${number.count}</p></td>
                                <td><input type="text" style="display: none" name="id" value="${user.id}"></td>
                            </tr>
                            <tr align="center">
                                <td>账号:</td>
                                <td>
                                    <input type="button" value="${user.account}" name="account"
                                           class="update-type-class">
                                </td>
                                <td rowspan="5"><input type="submit" value="确认"></td>
                            </tr>
                            <tr align="center">
                                <td>密码:</td>
                                <td>
                                    <input type="button" value="${user.password}" name="password"
                                           class="update-type-class">
                                </td>

                            </tr>
                            <tr style="width: 50px;height: 40px" align="center">
                                <td>邮箱:</td>
                                <td><input type="button" value="${user.email}" name="email" class="update-type-class">
                                </td>
                            </tr>
                            <tr align="center">
                                <td>身份等级:</td>
                                <td>
                                    <select id="user-card-id" name="userCardId">
                                        <c:choose>
                                            <c:when test="${user.cardID == 2}">
                                                <option value="2" selected>最高管理者</option>
                                                <option value="1" disabled>管理者</option>
                                                <option value="0" disabled>用户</option>
                                            </c:when>
                                            <c:when test="${user.cardID == 1}">
                                                <option value="2" disabled>最高管理者</option>
                                                <option value="1" selected>管理者</option>
                                                <option value="0">用户</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="2" disabled>最高管理者</option>
                                                <option value="1">管理者</option>
                                                <option value="0" selected>用户</option>
                                            </c:otherwise>
                                        </c:choose>
                                    </select>
                                </td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>

        </c:forEach>


    </table>
</div>
</div>
<script>
    // 假设你有一个元素数组
    var elements = document.querySelectorAll('.update-type-class');

    // 使用forEach为每个元素绑定点击事件
    elements.forEach(function (element) {
        element.addEventListener('click', function () {
            // 更改按钮类型为文本输入框
            this.type = 'text';

            // 可选：设置输入框的初始值
            this.value = this.getAttribute('value');
        });
    });
</script>
</body>
</html>
