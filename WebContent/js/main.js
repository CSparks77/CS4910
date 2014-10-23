$(document).ready(function() {
	$("li").each(function(index) {
		$(this).animate({opacity : "1"}, ((index + 1) * 500));
	});
	
	$("#blank").css("position","absolute");
	$("#blank").css("top", Math.max(0, (($(window).height() - $("#blank").outerHeight()) / 2) + 
                                                $(window).scrollTop()) + "px");
	$("#blank").css("left", Math.max(0, (($(window).width() - $("#blank").outerWidth()) / 2) + 
                                                $(window).scrollLeft()) + "px");
	$("#blank").delay(500).fadeIn(500);
});