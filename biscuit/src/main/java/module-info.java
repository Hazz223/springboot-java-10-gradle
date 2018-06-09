module com.harry.winser.spring.boot.java.biscuit {

    requires spring.beans;
    requires spring.boot;
    requires spring.web;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires jackson.annotations;
    requires java.validation;

    exports com.harry.winser.spring.boot.java.biscuit.web;
    exports com.harry.winser.spring.boot.java.biscuit.domain;
    exports com.harry.winser.spring.boot.java.biscuit.service;

    // so, it's not the internal structure thats the issue. It just doesn't seem to want to book for some reason...
}