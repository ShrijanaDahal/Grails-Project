package grailsprojectdomain

class Task {
    String name
    String description
    Date dueDate

    static belongsTo = [assignee: EndUser, project: Project]

    static constraints = {
        name(blank: false)
        description(blank: false, maxSize: 300)
        dueDate(min: new Date())
    }
}
