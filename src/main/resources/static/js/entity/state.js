$("document").ready(function () {
    $("table #edit-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $.get(href, function (state, status) {
            $("#stateId-edit").val(state.id);
            $("#ddl-country-edit").val(state.countryId);
            $("#description-edit").val(state.name);
            $("#capital-edit").val(state.capital);
            $("#code-edit").val(state.code);
            $("#details-edit").val(state.details);
        });

        $("#editModal").modal();
    });

    $("table #details-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $.get(href, function (state, status) {
            $("#stateId-details").val(state.id);
            $("#ddl-country-details").val(state.countryId);
            $("#description-details").val(state.name);
            $("#capital-details").val(state.capital);
            $("#code-details").val(state.code);
            $("#details-Details").val(state.details);
            //$("#last-updated-by-details").val(state.lastModifiedBy);
            //$("#last-updated-details").val(state.lastModifiedDate.substr(0, 19).replace("T", " "));
        });
        $("#detailsModal").modal();
    })

    $("table #delete-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $("#deleteModal #confirm-delete-button").attr("href", href);
        $("#deleteModal").modal();
    });
});