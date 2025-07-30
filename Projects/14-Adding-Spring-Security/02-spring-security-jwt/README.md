### Note
I made some modifications for the current version of the Spring to work correctly with the video class.

The main changes include changing the @EnableGlobalMethodSecurity annotation to @EnableMethodSecurity on 
`WebSecurityConfig.java` and removing the Extends from the same class as its methods are now used as a `@Bean`.

The HttpSecurity API has also changed, with a bunch of the previous method being removed or marked as `@Deprecated`.
I maintained the usage of some the deprecated methods as they are only going to be removed in Spring 7 and don't 
represent any major security breach as far as I could see.