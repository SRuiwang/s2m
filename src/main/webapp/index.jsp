<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/jquery-3.2.1.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <style type="text/css">
        .index-main-div {
            margin-top: 150px;
            margin-bottom: 150px;
            margin-left: 300px;
            margin-right: 300px;
            border: 1px solid #000000;
            width: auto;
            height: 400px;
        }
        .inner-div{
            width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
<script type="text/javascript">
    function getAjax() {
        $.ajax({
            url: '${pageContext.request.contextPath}/ajax/getdata/'+$('#dataid').val()+'.do',
            success:function (data,textStatus) {
                var jsonStr = JSON.stringify(data);
                alert(textStatus);
                $('#showdata').val(jsonStr);
            },
            dataType:'json'
    })
    }
</script>

<div class="index-main-div">
    <div class="col-lg-6">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for..." id="dataid">
            <span class="input-group-btn">
        <button class="btn btn-default" type="button" onclick="javascript:getAjax()">Go!</button>
      </span>
        </div><!-- /input-group -->
    </div><!-- /.col-lg-6 -->
    <br>
    <div class="inner-div">
        <textarea class="form-control" rows="3" id="showdata"></textarea>
    </div>
</div>

</body>
