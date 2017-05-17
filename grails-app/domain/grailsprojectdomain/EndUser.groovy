package grailsprojectdomain

class EndUser {
    String fullName
    String userName
    String password

    static hasMany = [project: Project, tasks: Task]

    static constraints = {
        fullName(nullable: false)
        userName(nullable: false)
        password(password: true)
    }
}
