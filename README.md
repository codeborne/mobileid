Mobile-ID
=========

**Obsolete**: this library used the SOAP/WSDL API for Mobile-ID, which has now be replaced by a new REST API.

[Mobile-ID](http://www.id.ee/?id=10995&&langchange=1) (Mobiil-ID) is a personal mobile identity in Estonia and Lithuania,
provided by an additional application on a SIM card. The good thing is that it 
is backed by government and provides the same level of security for authentication 
and digital signatures as a national ID card without the need of having a smart card reader.

Java and Mobile-ID
==================

The official Mobile-ID API is a SOAP web service, so it usually takes time to generate the code and
start using it in a Java application.

This small library tries to solve this problem: just add the [*mobileid.jar* (with dependencies)](http://mvnrepository.com/artifact/com.codeborne)
to your project and you have a working Mobile-ID support. It already contains all the generated classes (by axis v1) as well as a simplified API of our own.

The same jar works in Scala as well or any other JVM-based language.

You can also use Maven/Ivy/Gradle/SBT or your favorite dependency manager that can fetch jars from the official Maven2 repo:

  [com.codeborne :: mobileid](http://mvnrepository.com/artifact/com.codeborne/mobileid)

Usage
=====

Just use the public methods in [MobileIDAuthenticator](http://github.com/codeborne/mobileid/blob/master/src/com/codeborne/security/mobileid/MobileIDAuthenticator.java) class:

* startLogin(phoneNumber) - to initiate the login session, which will send a flash message to your mobile phone. The returned MobileIDSession contains the challenge code that you need to display to the user.
* waitForLogin(session) - to wait until user finally signs the challenge. This is a blocking call for simplicity.
* isLoginComplete(session) - if you want to do polling from the client side

See working example in [HelloMobileID.java](http://github.com/codeborne/mobileid/blob/master/test/com/codeborne/security/mobileid/HelloMobileID.java) - run the main() method.

# Thanks

Many thanks to these incredible tools that help us creating open-source software:

![Intellij IDEA](http://www.jetbrains.com/idea/docs/logo_intellij_idea.png)

![YourKit Java profiler](http://selenide.org/images/yourkit.png)

# License
mobile-id is open-source project and distributed under [MIT](http://choosealicense.com/licenses/mit/) license

[![Build Status](https://travis-ci.org/codeborne/mobileid.svg?branch=master)](https://travis-ci.org/codeborne/mobileid)
