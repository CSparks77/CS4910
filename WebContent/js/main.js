$(document).ready(function() {
	$("li").each(function(index) {
		$(this).animate({opacity : "1"}, ((index + 1) * 500));
	});
});