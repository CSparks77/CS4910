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
		$("#blank").css("position","absolute");
		$("#blank").css("top", Math.max(0, (($(window).height() - $("#blank").outerHeight()) / 2) + 
	                                                $(window).scrollTop()) + "px");
		$("#blank").css("left", Math.max(0, (($(window).width() - $("#blank").outerWidth()) / 2) + 
	                                                $(window).scrollLeft()) + "px");
		$("#blank").delay(500).fadeIn(500);
	});
	
	$("#kanban_workflow").click(function() {
		kanbanWorkflow();
	});
});

/**
 * This function will handle the Kanban Workflow
 * report button.
 */
function kanbanWorkflow() {
	$("#document").empty(); // Clear the div
	$("#document").load("dynamicHTML/kanbanWorkflow.html #viewport", function() {
		
	});
}