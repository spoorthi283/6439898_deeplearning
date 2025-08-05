
# Full Git Hands-on Labs

This project contains combined exercises from:
- Git Conflict Resolution (Lab 4)
- Git Cleanup and Push to Remote (Lab 5)

---

## 🔧 Lab 1: Conflict Resolution

### Objective:
Resolve merge conflicts using Git and visualize them with a merge tool (e.g., P4Merge).

### Steps:

```bash
git init

# Create and switch to a new branch
git checkout -b GitWork
echo "<message>Hello from GitWork branch</message>" > src/hello.xml
git add src/hello.xml
git commit -m "Add hello.xml in GitWork branch"

# Switch to master and add conflicting file
git checkout -b master
echo "<message>Hello from master branch</message>" > src/hello.xml
git add src/hello.xml
git commit -m "Add hello.xml in master"

# View history
git log --oneline --graph --decorate --all

# Merge and resolve conflicts
git merge GitWork

# Use P4Merge or any 3-way merge tool to resolve conflicts
# After resolving manually:
git add src/hello.xml
git commit -m "Resolved conflict"

# Optional: add backup pattern to .gitignore
echo "*.*~" >> .gitignore
git add .gitignore
git commit -m "Ignore backup files"

# Delete merged branch
git branch -d GitWork
```

---

## ☁️ Lab 2: Cleanup and Push to Remote

### Objective:
Sync local changes to a GitHub remote repository.

### Steps:

```bash
# Check current branch and state
git status
git branch -a

# Add remote (Replace with your GitHub repo)
git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPO.git

# Pull latest from master
git checkout master
git pull origin master

# Push local changes
git push origin master
```

---

> ⚠️ Replace `YOUR_USERNAME` and `YOUR_REPO` with your actual GitHub account and repo name.
