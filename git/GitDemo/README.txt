Git Hands-On Lab Guide
=======================

Step-by-Step Instructions:

1. Open Git Bash and navigate into the folder:
   cd path/to/GitDemo

2. Check git status:
   git status

3. Add a new file (example):
   echo "New content" > newfile.txt
   git add newfile.txt

4. Commit the file:
   git commit -m "Added newfile.txt"

5. To connect to your GitLab repository:
   git remote add origin https://gitlab.com/YOUR_USERNAME/GitDemo.git

6. Push to GitLab:
   git push -u origin master