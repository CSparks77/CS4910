<%--
  Description: This webpage will be responsible for providing the
               user an interface to interact with to retrieve
               reports for Scrumworks Pro.

  Author: James Manes (JAM38220@ucmo.edu)
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Scrumworks Reporter</title>

        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="css/main.css"/>
        <link rel="stylesheet" type="text/css" href="css/mobile.css"/>

        <!-- Javascript and jQuery library -->
        <script type="text/javascript" src="js/jquery.js"></script>
    	<script type="text/javascript" src="js/main.js"></script>
        
        <meta name="viewport" content="initial-scale = 1.0,maximum-scale = 1.0" />
    </head>
    <body>
        <div id="navbar">
        	<h1>Scrumworks Reporter</h1>
        	<ul>
        		<li id="kanban_workflow">Kanban Workflow</li>
        		<li id="kanban_activity">Kanban Activity</li>
        		<li id="user_activity)">User Activity</li>
        	</ul>
        </div>
        <div id="document">
        	<!-- This div is auto-filled by main.js depending
        		 upon user interaction -->
        </div>
    </body>
</html>
