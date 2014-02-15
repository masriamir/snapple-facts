(function(snapple, $, undefined) {

    /**
     * Creates AJAX request to retrieve a fact.
     */
    snapple.getFact = function() {
        $.ajax({
            type: 'GET',
            url: '/fact',
            dataType: 'HTML'
        })
            .done(function(html) {
                $('#fact').html(html);
            });
    };

}(window.snapple = window.snapple || {}, jQuery));

$(function() {
    $('#btnFact').click(function() {
        snapple.getFact();
    });
});
