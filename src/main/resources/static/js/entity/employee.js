$("document").ready(function () {
    $(".table .edit-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $.get(href, function (employee, status) {
            $("txtAddressEdit").val(employee.address);
            $("txtCityEdit").val(employee.city);
            $("ddlNationalityEdit").val(employee.countryId);
            $("txtDateOfBirthEdit").val(employee.dateOfBirth.subst(0, 10));
            $("txtEmailEdit").val(employee.email);
            $("txtFirstnameEdit").val(employee.firstname);
            $("ddlGenderEdit").val(employee.gender);
            $("txtInitialsEdit").val(employee.initials);
            $("txtLastnameEdit").val(employee.lastname);
            $("ddlMaritalStatusEdit").val(employee.maritalStatus);
            $("txtMobileEdit").val(employee.mobile);
            $("txtOthernameEdit").val(employee.othername);
            $("txtPhoneEdit").val(employee.phone);
            $("fupPhotoEdit").val(employee.photo);
            $("txtSSNEdit").val(employee.socialSecurityNumber);
            $("ddlStateEdit").val(employee.stateid);
            $("ddlTitleEdit").val(employee.title);
            $("ddlEmployeeTypeEdit").val(employee.employeeTypeId);
            $("txtHireDateEdit").val(employee.hireDate);
            $("ddlJobTitleEdit").val(employee.jobTitleId);
        })
        $("#editModal").modal();
    })

    $(".table #details-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $.get(href, function (employee, status) {
            $("#idDetails").val(employee.id);
            $("#descriptionDetails").val(employee.description);
            $("#detailsDetails").val(employee.details);
            $("#lastModifiedByDetails").val(employee.lastModifiedBy);
            $("#lastModifiedDateDetails").val(employee.lastModifiedDate.substr(0, 19).replace("T", " "));
        })
        $("#detailsModal").modal();
    })

    $(".table #delete-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $("#deleteModal #confirm-delete-button").attr("href", href);
        $("#deleteModal").modal();
    })

    $(".table #photo-button").on("click", function (event) {
        event.preventDefault();
        const href = $(this).attr("href");
        $("#photoModal #employee-photo").attr("src", href);
        $("#photoModal").modal();
    })
})