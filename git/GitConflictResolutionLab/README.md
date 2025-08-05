
# Git Conflict Resolution Hands-on Lab

## Objective:
Learn to resolve merge conflicts using Git and visualize using tools like P4Merge.

## Steps:

1. **Verify master is in a clean state:**
```bash
git status
```

2. **Create a branch and file:**
```bash
git checkout -b GitWork
echo "<message>Hello from GitWork branch</message>" > hello.xml
git status
```

3. **Commit the changes:**
```bash
git add hello.xml
git commit -m "Added hello.xml in GitWork branch"
```

4. **Switch to master and add different content:**
```bash
git checkout master
echo "<message>Hello from master branch</message>" > hello.xml
git add hello.xml
git commit -m "Added hello.xml in master with different content"
```

5. **View log graphically:**
```bash
git log --oneline --graph --decorate --all
```

6. **Use Git diff:**
```bash
git diff master GitWork
```

7. **Merge GitWork to master (expect conflict):**
```bash
git merge GitWork
```

8. **Use a merge tool (e.g., P4Merge) to resolve conflict.**

9. **After resolving, commit the merge:**
```bash
git add hello.xml
git commit -m "Resolved merge conflict in hello.xml"
```

10. **Ignore backup files if any:**
```bash
echo "*.*~" >> .gitignore
git add .gitignore
git commit -m "Add backup files to .gitignore"
```

11. **List branches and delete merged branch:**
```bash
git branch
git branch -d GitWork
```

12. **Final log view:**
```bash
git log --oneline --graph --decorate
```

---

> Use Git Bash or VS Code terminal. Make sure P4Merge or any merge tool is configured.

