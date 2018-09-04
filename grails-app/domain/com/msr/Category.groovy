package com.msr

import org.bson.types.ObjectId

class Category {
    ObjectId id
    String name
    Category parent = null
    static hasMany = [childs: Category]
    static mappedBy  = [ childs: 'childs' ]
    
    static constraints = {
        name nullable: false, blank: false
        parent nullable: true, blank: true
    }
}