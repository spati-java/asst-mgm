/**
 * 
 */
(function($){
	var x=0;
	var y=0;
	//cache a reference to the banner;
	var banner= $("#banner");
	//set initial banner background position ;
	banner.css('backgroundPosition',x+'px'+''+y+'px');
	//scroll up background position every 90 millisecond;
	window.setInterval(function(){banner.css('backgroundPosition',x+'px'+''+y+'px'); y--;}, 90);
	
	
})(jQuery);