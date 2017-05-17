import grailsprojectdomain.EndUser

class BootStrap {

    def init = { servletContext ->
        new grailsprojectdomain.EndUser(fullName: "Shrijana Dahal", userName: "Shrijana", password: "").save()
    }
    def destroy = {
    }
}
