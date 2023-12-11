# TestAutomationProject_HW1

# TestAutomationProject_HW1 readme.md file changed

# HW 1 KAPSAMINDA GIT ÜZERİNDE DENEDİĞİM KOMUTLAR :

# Copyright (C) Microsoft Corporation. All rights reserved.
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git clone https://github.com/demirbasbusra/TestAutomationProject_HW1.git
# remote: Enumerating objects: 3, done.
# remote: Counting objects: 100% (3/3), done.
# remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
# Receiving objects: 100% (3/3), done.
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git branch test_branch
# fatal: not a valid object name: 'master'
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git checkout -b
# error: switch `b' requires a value
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git branch -a
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git branch
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git checkout new_branch
# error: pathspec 'new_branch' did not match any file(s) known to git
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> dir
# 
# Directory: C:\Users\busra.demirbas\IdeaProjects\TEST
# 
# 
# Mode                 LastWriteTime         Length Name
# ----                 -------------         ------ ----
# d-----        11.12.2023     10:35                .idea
# d-----        11.12.2023     10:24                src
# d-----        11.12.2023     10:35                TestAutomationProject_HW1
# -a----        11.12.2023     10:24            490 .gitignore
# -a----        11.12.2023     10:24            643 pom.xml
# 
# 
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git status
# On branch master
# 
# No commits yet
# 
# Changes to be committed:
# (use "git rm --cached <file>..." to unstage)
# new file:   .gitignore
# new file:   .idea/.gitignore
# new file:   .idea/misc.xml
# new file:   .idea/vcs.xml
# new file:   pom.xml
# new file:   src/main/java/org/example/Main.java
# Changes not staged for commit:
# (use "git restore <file>..." to discard changes in working directory)
# modified:   .idea/vcs.xml
# modified:   pom.xml
# modified:   src/main/java/org/example/Main.java
# 
# Untracked files:
# (use "git add <file>..." to include in what will be committed)
# .idea/encodings.xml
# 
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git add README.md
# fatal: pathspec 'README.md' did not match any files
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git commit -m "README.md file changed"
# [master (root-commit) 4c66260] README.md file changed
# 6 files changed, 88 insertions(+)
# create mode 100644 .gitignore
# create mode 100644 .idea/misc.xml
# create mode 100644 pom.xml
# create mode 100644 src/main/java/org/example/Main.java
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> hit history
# hit : The term 'hit' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
# At line:1 char:1
# + hit history
# + ~~~
# + CategoryInfo          : ObjectNotFound: (hit:String) [], CommandNotFoundException
# + FullyQualifiedErrorId : CommandNotFoundException
# 
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git history
# git: 'history' is not a git command. See 'git --help'.
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git --help
# usage: git [-v | --version] [-h | --help] [-C <path>] [-c <name>=<value>]
# [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
# [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
# [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
# [--super-prefix=<path>] [--config-env=<name>=<envvar>]
# <command> [<args>]
# 
# These are common Git commands used in various situations:
# 
# start a working area (see also: git help tutorial)
# clone     Clone a repository into a new directory
# init      Create an empty Git repository or reinitialize an existing one
# 
# work on the current change (see also: git help everyday)
# add       Add file contents to the index
# mv        Move or rename a file, a directory, or a symlink
# restore   Restore working tree files
# rm        Remove files from the working tree and from the index
# 
# examine the history and state (see also: git help revisions)
# bisect    Use binary search to find the commit that introduced a bug
# diff      Show changes between commits, commit and working tree, etc
# grep      Print lines matching a pattern
# log       Show commit logs
# show      Show various types of objects
# status    Show the working tree status
# 
# grow, mark and tweak your common history
# branch    List, create, or delete branches
# commit    Record changes to the repository
# merge     Join two or more development histories together
# rebase    Reapply commits on top of another base tip
# switch    Switch branches
# tag       Create, list, delete or verify a tag object signed with GPG
# 
# collaborate (see also: git help workflows)
# fetch     Download objects and refs from another repository
# pull      Fetch from and integrate with another repository or a local branch
# push      Update remote refs along with associated objects
# 
# 'git help -a' and 'git help -g' list available subcommands and some
# concept guides. See 'git help <command>' or 'git help <concept>'
# to read about a specific subcommand or concept.
# See 'git help git' for an overview of the system.
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> git log
# commit f65120200995131d5b2a5a4e3b417dbfe8592d95 (HEAD -> master)
# Author: Büşra Demirbaş <busra.demirbas@defacto.com>
# Date:   Mon Dec 11 10:41:38 2023 +0300
# 
# README.md file changed
# 
# commit 4c66260102aacebbea3fa5ba0a6145da4eae01e6
# Author: Büşra Demirbaş <busra.demirbas@defacto.com>
# Date:   Mon Dec 11 10:40:07 2023 +0300
# 
# README.md file changed
# PS C:\Users\busra.demirbas\IdeaProjects\TEST> 
 