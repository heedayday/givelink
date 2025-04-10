<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Vue + JSP Example</title>
   <script src="https://cdn.jsdelivr.net/npm/vue@2"></script>
</head>
<body>
<div id="app">
    {{ message }}
</div>

<script>
    new Vue({
        el: '#app',
        data: {
            message: 'Hello from Vue!'
        }
    })
</script>
<%--<c:out value="Hello"/>--%>
</body>
</html>