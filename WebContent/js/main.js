/**
 * This file is responsible for manipulating the web app
 * via jQuery.
 */
$(document).ready(function() {
	
	// Fade in the top menu.
	$("li").each(function(index) {
		$(this).animate({opacity : "1"}, ((index + 1) * 500));
	});
	
	// Load the initial "No reports open." message.
	$("#document").load("dynamicHTML/noContent.html #blank", function() {
		// Display the "No reports open." message in the middle of the page.
		$('#blank').css({
	        'position' : 'absolute',
	        'left' : '50%',
	        'top' : '50%',
	        'margin-left' : -$("#blank").width()/2,
	        'margin-top' : -$("#blank").height()/2
	    });
		$("#blank").delay(500).fadeIn(500);
	});
	
	// Handle the navbar button clicks.
	$("#kanban_workflow").click(function() {
		kanbanWorkflow();
	});
	$("#kanban_activity").click(function() {
		kanbanActivity();
	});
	$("#user_activity").click(function() {
		userActivity();
	});
});

/**
 * This function will handle the Kanban Workflow
 * report button.
 */
function kanbanWorkflow() {
	$("#document").empty(); // Clear the div
	$("#document").load("dynamicHTML/kanbanWorkflow.html #viewport", function() {
		$("#viewport").fadeIn(200);
		$("#viewport").css({ "height" : $(window).height() - $("#navbar").height() });
	});
	
	// Use AJAX to call the Java servlet
	$.ajax({
        type: "POST",
        url: "RequestServlet",
        data :"kanban_workflow"
	});
}

/**
 * This function will handle the Kanban Activity
 * report button.
 */
function kanbanActivity() {
	$("#document").empty(); // Clear the div
	$("#document").load("dynamicHTML/kanbanActivity.html #viewport", function() {
		$("#viewport").fadeIn(200);
		$("#viewport").css({ "height" : $(window).height() - $("#navbar").height() });
	});
	
	// Use AJAX to call the Java servlet
	$.ajax({
        type: "POST",
        url: "RequestServlet",
        data :"kanban_activity"
	});
}

/**
 * This function will handle the User Activity
 * report button.
 */
function userActivity() {
	$("#document").empty(); // Clear the div
	$("#document").load("dynamicHTML/userActivity.html #viewport", function() {
		$("#viewport").fadeIn(200);
		$("#viewport").css({ "height" : $(window).height() - $("#navbar").height() });
	});
	
	// Use AJAX to call the Java servlet
	$.ajax({
        type: "POST",
        url: "RequestServlet",
        data :"user_activity"
	});
}