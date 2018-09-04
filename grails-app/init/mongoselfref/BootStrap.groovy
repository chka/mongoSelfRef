package com.msr

class BootStrap {

    def init = { servletContext ->
	def c1 = Category.findByName('category1') ?: new Category(name: 'category1').save(failOnError: true)
	def c2 = Category.findByName('category2') ?: new Category(name: 'category2', parent: c1).save(failOnError: true)
	c1.addToChilds(c2).save(failOnError: true)
    }
    def destroy = {
    }
}
