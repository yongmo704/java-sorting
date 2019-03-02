# The Algorithms - Java (WORK IN PROGRESS)

## Goal
Make it a working Java project with full fledged test cases for each algorithm and correct package structures. Once we have enough test coverage, we would merge it with master.

## Contribution Guidelines
 - If you add an algorithm then you have to add a test along with it. In the absence of a test, the PR would not be approved.
 - Follow the correct coding guidelines with proper description of the methods. Refer to [DecimalToAnyBase.java](https://github.com/TheAlgorithms/Java/blob/Development/src/main/java/com/conversions/DecimalToAnyBase.java) and [DecimalToAnyBaseTest.java](https://github.com/TheAlgorithms/Java/blob/Development/src/test/java/com/conversions/DecimalToAnyBaseTest.java) for the algorithms and tests coding standards, respectively.
 - Do not add a main method as we just need the actual algorithm in a method for the class which we are going to test in the test cases.
 - Please do not add a signature inside the code. The commit history is sufficient to determine who has added the code to the repo.
 - Make sure the algorithm which is getting added comes under a certain domain of Algorithms. Please don't create a package with a name such as Misc, Others, etc. 
 - While making a PR, make sure you are committing the Java files only and not any project specific files. If you feel that your IDE is generating some extra files, then either don't add them to git, or add the extensions to ```.gitignore```.
 - Please don't add solutions to problems from online judges such as Hackerrank, Leetcode, etc.

## Steps to raise a PR
- Fork the [Java Repo](https://github.com/TheAlgorithms/Java)
- Open the forked repo on your local machine 
- Switch to the ```Development``` branch by using the command ```git checkout Development```
- Add the JAR for JUnit to your build path. Here is a link for the [JUnit JAR](http://www.java2s.com/Code/Jar/j/Downloadjunit410jar.htm)
- Make the changes on your local machine
- Push the changes to the forked repository
- Raise a PR against the Development branch
