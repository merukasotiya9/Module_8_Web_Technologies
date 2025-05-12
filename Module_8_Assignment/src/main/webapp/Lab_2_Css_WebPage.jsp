<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSS Types Example</title>

<!--  Use internal CSS for another element.  -->  
    <!-- Internal CSS -->
    <style>
        .internal-style {
            color: white;
            background-color: navy;
            padding: 10px;
            border-radius: 5px;
        }
    </style>
     <link rel="stylesheet" href="styles.css">
    </head>
<body>
<!-- o You apply inline CSS to an element.  -->
<!-- Inline CSS -->
    <h1 style="color: green; font-size: 28px;">This heading uses inline CSS</h1>
    
    
     <!-- Internal CSS -->
    <p class="internal-style">This paragraph uses internal CSS.</p>
    
     <!-- External CSS -->
    <div class="external-style">
        This div uses styles from an external CSS file.
    </div>
    
</body>
</html>