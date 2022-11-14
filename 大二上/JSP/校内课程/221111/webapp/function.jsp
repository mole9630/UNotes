<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>function</title>
</head>
<body>
    \${fn:join(fn:split("aa bb cc", " "), "_")} = ${fn:join(fn:split("aa bb cc", " "), "_")}<br>
    \${fn:split("aa bb cc", "")} = ${fn:split("aa bb cc", "")}<br>
    \${fn:substring("abcdefg", 2, -1)} = ${fn:substring("abcdefg", 2, -1)}<br>
    \${fn:trim("    abcd    efg    ")} = ${fn:trim("    abcd    efg    ")}<br>
    \${fn:length(fn:trim("    abcd    efg    "))} = ${fn:length(fn:trim("    abcd    efg    "))}<br>
    \${fn:contains("abcd", "bcde")} = ${fn:contains("abcd", "bcde")}<br>
    \${fn:containsIgnoreCase("abcd", "ABC")} = ${fn:containsIgnoreCase("abcd", "ABC")}<br>
    \${fn:endsWith("abcd", "cd")} = ${fn:endsWith("abcd", "cd")}<br>
    \${fn:indexOf("abcd", "cd")} = ${fn:indexOf("abcd", "cd")}<br>
    \${fn:replace("abcd", "e", "d")} = ${fn:replace("abcd", "e", "d")}<br>
    \${fn:startsWith("abcd", "ab")} = ${fn:startsWith("abcd", "ab")}<br>
    \${fn:substring("abcd", 0, 3)} = ${fn:substring("abcd", 0, 3)}<br>
    \${fn:substringAfter("ab-cd", "-")} = ${fn:substringAfter("ab-cd", "-")}<br>
    \${fn:substringBefore("ab-cd", "-")} = ${fn:substringBefore("ab-cd", "-")}<br>
    \${fn:toLowerCase("ABCD")} = ${fn:toLowerCase("ABCD")}<br>
    \${fn:toUpperCase("abcd")} = ${fn:toUpperCase("abcd")}<br>

</body>
</html>
