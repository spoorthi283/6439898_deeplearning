
Git Hands-On Lab 2: .gitignore Demonstration
============================================

This project demonstrates how to ignore unwanted files and folders using .gitignore.

Steps Done in This Project:
1. Initialized a Git repository.
2. Created a `.log` file and a `log/` folder.
3. Added `.log` and `log/` to `.gitignore` so they are not tracked by Git.

Commands you can use:
    git init          - to initialize the Git repo (if not already)
    git status        - to verify ignored files
    git add .         - to stage everything else
    git commit -m "Initial commit excluding .log and log/"
    git remote add origin <your-gitlab-repo-url>
    git push -u origin main

