
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to iNote v1.0</title>
</head>
<style>
    h1 {
        text-align: center;
        overflow: hidden;
        background: linear-gradient(90deg, #000, #ffb419, #000);
        background-repeat: no-repeat;
        background-size: 80%;
        animation: animate 3s linear infinite;
        -webkit-background-clip: text;
        -webkit-text-fill-color: rgba(255, 255, 255, 0);
    }

    @keyframes animate {
        0% {
            background-position: -500%;
        }
        100% {
            background-position: 500%;
        }
    }
</style>
<body>
<h1>Welcome to iNote v1.0</h1>
<p style="text-align: center">Click <a href="/notes">here</a> to start using iNote!</p>
</body>
</html>
