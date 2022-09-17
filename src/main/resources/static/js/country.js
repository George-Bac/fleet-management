$("document").ready(function () {
    $("table #edit-button").on("click", function (event) {
        event.preventDefault();

        const href = $(this).attr("href");
        $.get(href, function (country, status) {
            $("#countryId-edit").val(country.countryId);
            $("#description-edit").val(country.description);
            $("#capital-edit").val(country.capital);
            $("#continent-edit").val(country.continent);
            $("#nationality-edit").val(country.nationality);
            $("#code-edit").val(country.code);
        });

        $("#editModal").modal();
    });

    $("table #delete-button").on("click", function (event) {
        event.preventDefault();

        const href = $(this).attr("href");
        $("#confirm-delete-button").attr("href", href);
        $("#deleteModal").modal();
    })
});