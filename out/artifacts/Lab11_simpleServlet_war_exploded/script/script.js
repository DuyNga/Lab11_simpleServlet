$(function () {
    $("#_form").submit(function () {
        if ($("input[name='txtName']").val() === "") {
            alert("Please input Name");
            $("input[name='txtName']").focus();
            return false;
        }
        if ($("input[name='txtEmail']").val() === "") {
            alert("Please input Email");
            $("input[name='txtEmail']").focus();
            return false;
        }
        if ($("input[name='txtProblem']").val() === "") {
            alert("Please input Problem");
            $("input[name='txtProblem']").focus();
            return false;
        }
    });
});