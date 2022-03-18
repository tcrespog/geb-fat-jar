package main

import geb.Browser

class Main {

    static void main(String[] args) {

        System.setProperty('geb.env', 'firefox')

        def browser = new Browser()
        browser.go('https://github.com')

    }

}
