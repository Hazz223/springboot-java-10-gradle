module com.harry.winser.spring.boot.java.biscuit {

    requires spring.beans;
    requires spring.boot;
    requires spring.web;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires jackson.annotations;
    requires java.validation;

    exports com.harry.winser.spring.boot.java.biscuit.web;}