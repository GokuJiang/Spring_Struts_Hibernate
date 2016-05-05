<%--
  Created by IntelliJ IDEA.
  User: jiangyongming
  Date: 5/3/16
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>;
<head>
    <meta charset="UTF-8">
    <title>indexPage</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div clsas="container" id="container">

    <form action="searchAction.action" name="search" method="post">
        <div class="radio">
            <label>
                <input type="radio" name="method" id="optionsRadios1" value="title" checked>题目
            </label>

            <label>
                <input type="radio" name="method" id="optionsRadios2" value="author">作者
            </label>

            <label>
                <input type="radio" name="method" id="optionsRadios3" value="content">内容
            </label>

        </div>

        <input type="text" class="form-control" name="content">
        <button type="submit" class="btn btn-default" id="search">搜索</button>
    </form>
</div>


<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>

</html>
