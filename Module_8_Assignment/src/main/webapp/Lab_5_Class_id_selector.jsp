<!-- 1. Create a webpage where:  -->
<!-- o You apply an id to an element and style it uniquely.  -->
<!-- o Use class to apply the same style to multiple elements.  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>ID aur Class Example</title>
  <style>
    /* ID ke liye style (ek unique element ke liye) */
    #special {
      background-color: lightgreen;
      color: darkgreen;
      padding: 15px;
      font-size: 20px;
      text-align: center;
      border: 2px solid green;
    }

    /* Class ke liye style (jo sabhi elements par apply hoga jinke paas ye class ho) */
    .common-box {
      background-color: #f2f2f2;
      color: #333;
      padding: 10px;
      margin: 10px 0;
      border-left: 5px solid #666;
    }
  </style>
</head>
<body>

  <!-- ID use karke unique styling -->
  <div id="special">
    Main ek special box hoon - mujhe alag styling mili hai!
  </div>

  <!-- Class use karke same styling -->
  <div class="common-box">
    Main ek common box hoon.
  </div>

  <div class="common-box">
    Main bhi wahi common style use karta hoon.
  </div>

  <div class="common-box">
    Ek aur common box hoon main!
  </div>

</body>
</html>
