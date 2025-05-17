document.getElementById("myForm")
    .addEventListener("submit", (e) => {
        e.preventDefault()
        var formData = new FormData()
        formData.append("subCode", document.getElementById("subCode").value)
        formData.append("subName", document.getElementById("subName").value)
        formData.append("subDoc", document.getElementById("subDoc").files[0])

        fetch("http://localhost:8080/book",
            {
                method: "post",
                body: formData
            }
        )
            .then(() => {
                alert("successfully added");
            }
            )
            .catch(err => {
                alert("error:" + err);
            });
    });