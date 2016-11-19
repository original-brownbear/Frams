# Frams

Dockerized big data frameworks for integration testing in Java and Scala.

# Motivation

Big data frameworks are generally very challenging to properly set up for 
integration testing in a portable manner.

This project tries to provide a few widely used frameworks in an easily accessible
manner, requiring only a Docker host and Java 7.
A conscious effort is made to not use any dependencies potentially incompatible
with test code (e.g. Jersey 2.x and Hadoop 2.x).
