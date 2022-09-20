$("document").ready(function () {
    $("table #edit-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $.get(href, function (state, status) {
            $("#stateId-edit").val(state.stateId);
            $("#ddl-country-edit").val(state.countryId);
            $("#capital-edit").val(state.capital);
            $("#code-edit").val(state.code);
            $("#name-edit").val(state.name);
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
            $("#capital-details").val(state.countryId);
            $("#code-details").val(state.countryId);
            $("#description-details").val(state.name);
            $("#details-Details").val(state.details);
            //$("#last-updated-by-details").val(state.lastModifiedBy);
            //$("#last-updated-details").val(state.lastModifiedDate.substr(0, 19).replace("T", " "));
        });
        $("#detailsModal").modal();
    })

    $("table #delete-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $("#deleteModal #delRef").attr("href", href);
        $("#deleteModal").modal();
    });
});