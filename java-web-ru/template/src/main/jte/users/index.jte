@import exercise.dto.users.UsersPage;
@param UsersPage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
    <title>Пользователи</title>
</head>
<body>
<main>
    <h1>Пользователи</h1>
    @if(page.getUsers().isEmpty())
        <p>Пользователей пока нет</p>
    @else
        <table class="table">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">LastName</th>
                <th scope="col">Email</th>
                <th scope="col">Link</th>
            </tr>
            </thead>
            <tbody>
            @for(var user : page.getUsers())
                <tr>
                    <th scope="row">${user.getId()}</th>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                    <td><a href="/users/${user.getId()}">Link</a></td>
                </tr>
            @endfor
            </tbody>
        </table>
    @endif
</main>
</body>
</html>