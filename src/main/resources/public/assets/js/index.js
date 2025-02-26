// smooth scroll
$(document).ready(function(){
    $(".navbar .nav-link").on('click', function(event) {
        if (this.hash !== "") {
            event.preventDefault();

            const hash = this.hash;

            $('html, body').animate({
                scrollTop: $(hash).offset().top
            }, 700, function(){
                window.location.hash = hash;
            });
        } 
    });
});

// Back to top
const backTop = $(".btn-back_to_top");
$(window).scroll(function() {
    if($(document).scrollTop() > 400) {
        backTop.css('visibility', 'visible');
    }
    else if($(document).scrollTop() < 400) {
        backTop.css('visibility', 'hidden');
    }
});
backTop.click(function() {
    $('html').animate({
        scrollTop: 0
    }, 1000);
    return false;
});

// portfolio filters
$(window).on("load", function() {
    const t = $(".portfolio-container");
    t.isotope({
        filter: ".new",
        animationOptions: {
            duration: 750,
            easing: "linear",
            queue: !1
        }
    }), $(".filters a").click(function() {
        $(".filters .active").removeClass("active"), $(this).addClass("active");
        const i = $(this).attr("data-filter");
        return t.isotope({
            filter: i,
            animationOptions: {
                duration: 750,
                easing: "linear",
                queue: !1
            }
        }), !1
    });
});