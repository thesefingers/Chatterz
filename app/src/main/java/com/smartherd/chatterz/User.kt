package com.smartherd.chatterz

class User { // Firebase needs empty constructor hence, we're nor using DATA CLASS
    var name: String? = null
    var email: String? = null
    var uid: String? = null

    constructor() {}

    constructor(name: String?, email: String?, uid: String?) {
        this.name = name
        this.email = email
        this.uid = uid
    }
}