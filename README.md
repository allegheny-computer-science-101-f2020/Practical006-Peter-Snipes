# cs101f2020-practical06

## DUE: November 9 by 9:10am

[![Actions Status](../../workflows/build/badge.svg)](../../actions)

## Table of Contents

- [Objectives](#objectives)
- [Introduction](#introduction)
- [Continuous Learning](#continuous-learning)
- [System Commands](#system-commands)

  - [Using Docker](#using-docker)
  - [Using Gradle](#using-gradle)

- [Program Requirements](#program-requirements)

- [Using GitHub Actions CI](#using-github-actions-ci)

- [Reporting Problems](#reporting-problems)

- [Receiving Assistance](#receiving-assistance)

- [Practical Assessment](#practical-assessment)

## Objectives

To continue to practice using GitHub to access the files for an assignment. You will complete a programming project using the minimal source code provided by the course instructor, ultimately implementing and testing a Doubly Linked List class. Specifically, you will implement public methods for the Doubly Linked List data structure. Then, you will run experiments by calling each implemented method. Finally, you will continue to learn how to implement and test a Java program, practicing the creation of Java classes on your own and using an automated grading tool to assess your progress towards correctly completing the project.

## Introduction

This assignment requires a programmer to implement and test a Doubly Linked List data structure. More details about this implementation is provided in Section 3.4.1\. Please note that this assignment will also require you to read and use Java classes that contain a test suite. Specifically, the programmer is also responsible for learning how to run and extend a test suite written in the JUnit testing framework, as explained in Section 1.9\. As verified by [Checkstyle](https://github.com/checkstyle/checkstyle), the source code for all of the Java classes must adhere to all of the requirements in the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The source code in the submitted Java source code files must also pass additional tests set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader). Gradle will also run a JUnit test suite that will perform many checks on your implementation of the Java classes.

## Continuous Learning

If you have not done so already, please read all of the relevant [GitHub Guides](https://guides.github.com/) that explain how to use many of the features that GitHub provides. In particular, please make sure that you have read the following GitHub guides: [Mastering Markdown](https://guides.github.com/features/mastering-markdown/), [Hello World](https://guides.github.com/activities/hello-world/), and [Documenting Your Projects on GitHub](https://guides.github.com/features/wikis/). Each of these guides will help you to understand how to use both [GitHub](http://github.com) and [GitHub Classroom](https://classroom.github.com/).

Students who want to learn more about how to use [Docker](https://www.docker.com) should review the [Docker Documentation](https://docs.docker.com/). Students are also encouraged to review the documentation for their text editor, which is available for text editors like [Atom](https://atom.io/docs) and [VS Code](https://code.visualstudio.com/docs). You should also review the [Git documentation](https://git-scm.com/doc) to learn more about how to use the Git command-line client. In addition to talking with the instructor and technical leader for your course, students are encouraged to search [StackOverflow](https://stackoverflow.com/) for answers to their technical questions.

To do well on this assignment, you should also Sections 3.2 and 3.4 of your textbook to learn more about Singly and Doubly Linked Lists. Please see the course instructor or one of the teaching assistants if you have questions about the reading assignments.

## Program Requirements

This primary goal for this assignment is to allow students the opportunity to practice implementing a new data structure, namely Doubly Linked List. Critically, it is important to note that the build of the provided source code will fail because it is missing methods that you must implement. As such, it is your responsibility to study the provided source code and add in all of the new code, with the guidance of the instructor, that you need to ensure that the system compiles and runs an experiment to demonstrate the use of the `DoublyLinkedList`'s methods.

## System Commands

This project invites students to enter system commands into a terminal window. This assignment uses [Docker](https://www.docker.com) to deliver programs, such as `gradle` and the source code and packages needed to run [GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students' computer, thereby eliminating the need for a programmer to install them on their development workstation. Individuals who do not want to install Docker can optionally install of the programs mentioned in the [Project Requirements](#requirements) section of this document.

### Using Docker

Once you have installed [Docker Desktop](https://www.docker.com/products/docker-desktop), you can use the following `docker run` command to start `gradle grade` as a containerized application, using the [DockaGator](https://github.com/GatorEducator/dockagator) Docker image available on [DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as the project directory and `"$HOME/.dockagator"` as the cached GatorGrader directory. Please note that both of these directories must exist, although only the project directory must contain something. Generally, the project directory should contain the source code and technical writing of this assignment, as provided to a student through GitHub. Additionally, the cache directory should not contain anything other than directories and programs created by DockaGator, thus ensuring that they are not otherwise overwritten during the completion of the assignment. To ensure that the previous command will work correctly, you should create the cache directory by running the command `mkdir $HOME/.dockagator`.

If you are running your program on a Windows Operating System, you should run the following command instead, replacing the word "user" with the username of your machine:

```bash
docker run --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator
```

Here are some additional commands that you may need to run when using Docker:

- `docker info`: display information about how Docker runs on your workstation
- `docker images`: show the Docker images installed on your workstation
- `docker container list`: list the active images running on your workstation
- `docker system prune`: remove many types of "dangling" components from your workstation
- `docker image prune`: remove all "dangling" docker images from your workstation
- `docker container prune`: remove all stopped docker containers from your workstation
- `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

Since the above `docker run` command uses a Docker image that, by default, runs `gradle grade` and then exits the Docker container, you may want to instead run the following command so that you enter an "interactive terminal" that will allow you to repeatedly run commands within the Docker container.

In Linux and Mac OS:

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

In Windows OS:

```bash
docker run -it --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by typing the command `gradle grade` in your terminal. Running this command will produce a lot of output that you should carefully inspect. If GatorGrader's output shows that there are no mistakes in the assignment, then your source code and writing are passing all of the automated baseline checks. However, if the output indicates that there are mistakes, then you will need to understand what they are and then try to fix them.

You can also complete several important Java programming tasks by using the `gradle` tool. For instance, you can compile (i.e., create bytecode from the program's source code if it is correct) the program using the command `gradle build`. Here are some other commands that you can type:

- `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle run`: run the Java program in the command-line
- `gradle cleanTest`: clean the JUnit test suite of derived files
- `gradle test`: run the JUnit test suite and display the results
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base") directory for this assignment where the `build.gradle` file is located.

## Using GitHub Actions CI

This assignment does NOT use [GitHub Actions CI](https://github.com/features/actions) to automatically run [GatorGrader](https://github.com/GatorEducator/gatorgrader), thus you will not see either a yellow ● or a green ✔ or a red ✗ in your listing of commits. Instead, you should run the GatorGrader locally to ensure your solution passes a satisfactory number of checks.

## Reporting Problems

If you have found a problem with this assignment's provided source code or documentation, then you can go to the [Computer Science 101 Fall 2020 Practical 06](https://github.com/allegheny-computer-science-101-f2020/practical06) repository and [raise an issue](https://github.com/allegheny-computer-science-101-f2020/practical06/issues). If you have found a problem with the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks your assignment, then you can also [raise an issue](https://github.com/GatorEducator/gatorgrader/issues) in that repository. To ensure that your issue is properly resolved, please provide as many details as is possible about the problem that you experienced. If you discover a problem with the assignment sheet for this project, then please raise an issue in the GitHub repository that provides the assignment sheets for your course.

Whenever possible, individuals who find, and use the appropriate GitHub issue tracker to correctly document, a mistake in any aspect of this assignment will receive free [GitHub stickers](https://octodex.github.com/) and extra credit towards their grade for the project.

## Receiving Assistance

If you are having trouble completing any part of this project, then please talk with either the course instructor or a student technical leader during the course session. Alternatively, you may ask questions in the Slack workspace for this course. Finally, you can schedule a meeting during the course instructor's office hours.

## Practical Assessment

The grade that a student receives on this practical assignment is a checkmark grade (0 or 1) and is based on:

- **Percentage of Correct Gatorgrader Checks**: Students will receive 1 if their solution passes at least 90% of GatorGrader checks (32/35), otherwise they will receive 0\. Students are encouraged to repeatedly revise their source code in an attempt to get their GitHub Actions CI build to pass.
