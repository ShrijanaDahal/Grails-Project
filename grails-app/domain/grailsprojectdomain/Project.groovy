package grailsprojectdomain

import grailsprojectdomain.EndUser
import grailsprojectdomain.Task

class Project {
    String name
    String description
    Date dueDate

    static belongsTo = [assignee: EndUser]
    static hasMany = [tasks: Task]

    static constraints = {
        name(blank: false, unique: true)
        description(blank: false)
        dueDate(min: new Date())
    }
}
