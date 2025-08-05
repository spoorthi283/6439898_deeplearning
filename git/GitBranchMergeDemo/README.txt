
Git Hands-On Lab 3: Branching and Merging
=========================================

Objectives:
- Practice Git branching and merging
- Simulate real workflow with feature branches
- (Optional) Use P4Merge for visual diff

Steps:
1. git init
2. git checkout -b GitNewBranch          # create and switch to new branch
3. echo "Some changes in branch" > branchfile.txt
4. git add branchfile.txt
5. git commit -m "Added branchfile.txt in GitNewBranch"
6. git checkout main                     # switch back to main (or master)
7. git merge GitNewBranch               # merge changes into main
8. git log --oneline --graph --decorate # view merge history
9. git branch -d GitNewBranch           # delete merged branch

To list all branches:
    git branch -a

To use P4Merge for visual diffs (if installed):
    git difftool -t p4merge

